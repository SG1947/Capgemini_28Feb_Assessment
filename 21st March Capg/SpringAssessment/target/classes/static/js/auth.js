// ─── Config ────────────────────────────────────────────
const BASE_URL = "http://localhost:8082/api";
 
// ─── Utility: Show message banner ──────────────────────
function showMessage(text, type) {
  const msg = document.getElementById("message");
  msg.textContent = text;
  msg.className = `message ${type}`;   // 'success' or 'error'
}
 
// ─── Utility: Toggle password visibility ───────────────
function togglePassword(inputId, iconEl) {
  const input = document.getElementById(inputId);
  if (input.type === "password") {
    input.type = "text";
    iconEl.style.opacity = "1";
  } else {
    input.type = "password";
    iconEl.style.opacity = "0.5";
  }
}
 
// ─── Utility: Set button loading state ─────────────────
function setLoading(btnId, isLoading, defaultText) {
  const btn = document.getElementById(btnId);
  btn.disabled = isLoading;
  btn.innerHTML = isLoading
    ? `<span class="spinner"></span>Please wait...`
    : defaultText;
}
 
// ─── Register Handler ───────────────────────────────────
async function handleRegister() {
  const username = document.getElementById("username").value.trim();
  const email    = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value;
 
  // Basic client-side validation
  if (!username || !email || !password) {
    showMessage("All fields are required.", "error");
    return;
  }
  if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
    showMessage("Please enter a valid email address.", "error");
    return;
  }
  if (password.length < 8) {
    showMessage("Password must be at least 8 characters.", "error");
    return;
  }
 
  setLoading("registerBtn", true, "Register");
 
  try {
    const response = await fetch(`${BASE_URL}/register`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ username, email, password }),
    });
 
    const text = await response.text();   // backend returns plain String
 
    if (response.ok) {
      showMessage(text, "success");
      // Redirect to login after short delay
      setTimeout(() => window.location.href = "login.html", 1800);
    } else {
      showMessage(text, "error");
    }
  } catch (err) {
    showMessage("Could not reach the server. Is Spring Boot running?", "error");
  } finally {
    setLoading("registerBtn", false, "Register");
  }
}
 
// ─── Login Handler ──────────────────────────────────────
async function handleLogin() {
  const username = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value;
 
  if (!username || !password) {
    showMessage("Username and password are required.", "error");
    return;
  }
 
  setLoading("loginBtn", true, "Login");
 
  try {
    const response = await fetch(`${BASE_URL}/login`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ username, password }),
    });
 
    const text = await response.text();
 
    if (response.ok) {
      showMessage(text, "success");
	  setTimeout(() => {
	          window.location.href = `dashboard.html?user=${encodeURIComponent(username)}`;
	        }, 1200);
    } else {
      showMessage(text, "error");
    }
  } catch (err) {
    showMessage("Could not reach the server. Is Spring Boot running?", "error");
  } finally {
    setLoading("loginBtn", false, "Login");
  }
}
 
// ─── Allow Enter key to submit ──────────────────────────
document.addEventListener("keydown", (e) => {
  if (e.key !== "Enter") return;
  const loginBtn    = document.getElementById("loginBtn");
  const registerBtn = document.getElementById("registerBtn");
  if (loginBtn)    handleLogin();
  if (registerBtn) handleRegister();
});
 
package Week2.objects;

public class Candidate {
    String name;
    long mobileNumber;
    boolean gender;
    public void study() {
    	System.out.println("Studying");
    }

	public Candidate(String name, long mobileNumber, boolean gender) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	public Candidate(long mobileNumber, String name,boolean gender) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
    //alt+shift+s
}

package newprog;

public class Elseif {
	public static void main(String[] args) {
    //uppercase,lowercase, number, special character
	char ch='$';
	if(ch>='a' && ch<='z') {
		System.out.println("Lowercase");
	}
	else if(ch>='A' && ch<='Z') {
		System.out.println("Uppercase");
	}
	else if(ch>='0' && ch<='9') {
		System.out.println("Number");
	}
	else {
		System.out.println("Special character");
	}

}
}
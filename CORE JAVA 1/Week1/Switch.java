package newprog;

public class Switch {
	public static void main(String[] args) {
    //uppercase,lowercase, number, special character
	char ch='7';
	int c;
	if(ch>='a' && ch<='z') {
		c=1;
	}
	else if(ch>='A' && ch<='Z') {
		c=2;
	}
	else if(ch>='1' && ch<='9') {
		c=3;
	}
	else {
		c=4;
		
	}
	switch(c) {
	case 1: 
		System.out.println("Lowercase");
	    break;
	case 2:
		System.out.println("Uppercase");
		break;
	case 3:
		System.out.println("Number");
		break;
	case 4:
		System.out.println("Special character");
		break;
	}
	

}
}
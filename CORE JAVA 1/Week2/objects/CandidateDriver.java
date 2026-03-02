package Week2.objects;

public class CandidateDriver {

	public static void main(String[] args) {
//		Candidate c1 = new Candidate();
//		c1.name="Rajan";
//		System.out.println(c1.name);
//		System.out.println(c1.mobileNumber);
//		System.out.println(c1.gender);
		Candidate c2 = new Candidate("name",91234,true);
		System.out.println(c2.name);
		System.out.println(c2.mobileNumber);
		System.out.println(c2.gender);
	}

}

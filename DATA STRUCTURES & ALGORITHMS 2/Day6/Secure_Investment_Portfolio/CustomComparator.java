package DSA.Day6.Secure_Investment_Portfolio;

import java.util.Comparator;

public class CustomComparator implements Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) {
		// TODO Auto-generated method stub
		if(o1<o2) return 1;
		else if(o1>o2) return -1;
		return 0;
	}
	

}

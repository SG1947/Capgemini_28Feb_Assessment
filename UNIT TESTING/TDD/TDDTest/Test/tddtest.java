package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tddtest {
     tdd testing=new tdd();
	@Test
	void revtest() {
	    String message="Not working";
		assertEquals("olleh", testing.rev("hello"),message);
		
	}

}

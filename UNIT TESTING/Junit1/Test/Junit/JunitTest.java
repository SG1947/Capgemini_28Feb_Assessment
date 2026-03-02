package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		Junit junit=new Junit();
	    int actual=junit.add(2, 3);
	    int expected=6;
	    assertEquals(expected,actual);
	    
	    
	}

}

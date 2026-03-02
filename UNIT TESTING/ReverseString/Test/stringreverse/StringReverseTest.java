package stringreverse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)//creates only one object for all the test cases 
class StringReverseTest {
	stringReverse sr=new stringReverse();
	@BeforeEach
	public void start() {
		System.out.println("Before Each");
	}
	@AfterEach
	public void end() {
		System.out.println("After Each");
	}
	@BeforeAll
	public void beforeall() {
		System.out.println("Before All");
	}
	@AfterAll
	public void afterall() {
		System.out.println("After All");
	}
	@Test
	void stringtest() {
		
		String actual1=sr.reverse("hi");
		String expected1="ih";
		assertEquals(expected1, actual1);
			
	}
	@Test
	void addTest(){
		
		int actual=sr.add(2, 3);
		int expected=5;
		assertEquals(expected, actual);
	}
	@Test
	void boolTest() {
		assertTrue(sr.check(34));
	}
	@Test
	void bool1Test() {
		assertFalse(sr.check(21));
	}
    @Test
    void arrayTest(){
       	int[] expected = {1, 2, 3};
        int[] actual = sr.odd(new int[]{1, 2, 3});
        assertArrayEquals(expected, actual);
    }
    @Test
    void testStringArray() {

        String[] expected = {"hi", "hello"};
        String[] actual = {"hi", "hello"};

        assertArrayEquals(expected, actual);
    } 
    @Test //Exception Handling 
    public void arrayTest1() {
//    	int arr[]= null;
    	int arr[]= {1,2,3};
    	try {
    		for(int i=0;i<arr.length+1;i++) {
        		System.out.println(arr[i]);
        	}
			
		} 
    	catch (NullPointerException e) {
			System.out.println("Exception handled");
	}
    	catch(ArrayIndexOutOfBoundsException e1) {
    		System.out.println("Index out of bound Exception");
    	}
    
    }
}

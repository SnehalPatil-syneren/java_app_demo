package MyPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClass {

	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";
        assertEquals("This is the testcase in this class", str1);
	}

}

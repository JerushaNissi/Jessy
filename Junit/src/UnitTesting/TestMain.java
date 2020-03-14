package UnitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import junit.framework.TestSuite;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Result res=JUnitCore.runClasses(TestSuite.class);
			
			for(Failure failure:res.getFailures())
			{
				System.out.println(failure.toString());
			}
			System.out.println(res.wasSuccessful());
	}

}

package UnitTesting;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Test1 
{
	@BeforeAll
	//it executes before beginning of test case
	public  static void beforeClass() {
		System.out.println("This method executes before begining of class");
	}
	@AfterAll
	//it executes after end of all test cases
	public static  void afterClass() {
		System.out.println("This method executes after ending of class");
	}
	@Test//the method that is to be tested must be notified as @test annotation
	public void test1() {
		System.out.println("This is my test case 1");
	}
	@BeforeEach
	//this method executes before and every test than any other method during execution
	public void displayBefore() {
		System.out.println("It executes before any test case...");
	}
	@Test
	@RepeatedTest(3)
	//this method is executed for 3 times
	public void test2() {
		System.out.println("This is my test case 2");
	}
	@AfterEach
	//this method executes after and every test than any other method during execution
	public void displayAftrer() {
		System.out.println("It executes after any test case...");
	}
	
	@ParameterizedTest//ensures values are assigned
	@ValueSource(strings= {"Anuja","Dhanekula","I LOVE YOU"})
	void loginTest(String str)
	{
		System.out.println(str);
	}
	@Disabled
	public void test3()
	{
		System.out.println("This is not Executed...........");
	}
	@Test
	//@Timeout(500)
	public void timeTest()
	{
		try{
			System.out.println("this method have to executed within the time.....");
		}catch(Exception e){
		System.out.println(e);
		}
	}
}
/*Methods under test annotation are executed based on
1.order in which they are written..to give method ordering we can give an annotation
TestMethodOrder 
*/

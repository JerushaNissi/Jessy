package eventExamples;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEvent {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Event.xml");

      // Let us raise a start event.
      context.start();
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      //let us call refresh
      context.refresh();
      
      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
      obj1.getMessage();
      
      // Let us raise a stop event.
      context.stop();
   }
}

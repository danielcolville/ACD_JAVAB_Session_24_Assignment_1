package hello2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("hello2/beans.xml");
		Hello inst=(Hello) context.getBean("hello2");
		System.out.print("Your message: ");
		System.out.println(inst.getMessage());
	}

}

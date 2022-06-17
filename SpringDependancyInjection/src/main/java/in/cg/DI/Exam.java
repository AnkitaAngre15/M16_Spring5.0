package in.cg.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
	 
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		/*Student s=c.getBean("s",Student.class);
		s.print();*/
		Student s1=c.getBean("s1",Student.class);
		s1.print();
		
	}

}

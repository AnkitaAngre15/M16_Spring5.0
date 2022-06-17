package in.cg.DI1;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cg.DI.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		
		Student1 s1=c.getBean("s1",Student1.class);
		s1.cheating();
		
		AnotherStudent s2=c.getBean("s2",AnotherStudent.class);
		s2.startcheating();
	}

}

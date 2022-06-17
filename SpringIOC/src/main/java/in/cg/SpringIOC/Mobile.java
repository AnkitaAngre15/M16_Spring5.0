package in.cg.SpringIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
		
		Sim a=c.getBean(Sim.class);
		a.calling();
		a.data();
		Sim j=c.getBean(Sim.class);
		j.calling();
		j.data();
		System.out.println("The Program Is Executed");

	}

}

package in.cg.SDIwithCollection;



		import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
		   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

		      jc.getAddressList();
		      jc.getAddressSet();
		      jc.getAddressMap();
		      jc.getAddressProp();
		   }
		

	}


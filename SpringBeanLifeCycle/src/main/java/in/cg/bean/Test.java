package in.cg.bean;


	import java.sql.SQLException;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Test {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			ApplicationContext c=new ClassPathXmlApplicationContext("Beans.xml");
			StudentDao a=c.getBean(StudentDao.class);
			a.selectAllRows();
		}


}

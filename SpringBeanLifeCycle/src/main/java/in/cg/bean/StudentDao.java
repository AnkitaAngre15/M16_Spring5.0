package in.cg.bean;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class StudentDao 
	{
		private String driver;
		private String url;
		private String user;
		private String password;
		
		public void setDriver(String driver) {
			this.driver = driver;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void selectAllRows() throws ClassNotFoundException, SQLException
		{
			//load the driver
			Class.forName(driver);
			
			//get connection
			Connection con=DriverManager.getConnection(url, user, password);
			
			//execute a query
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery("SELECT * FROM placementdb.certificate1");
			while(r.next())
			{
				int id=r.getInt(1);
				int year=r.getInt(2);
				String college=r.getString(3);
				
				System.out.println("ID IS: "+id+" Year Is: "+year+" College IS: "+college);
			}
		}

	}
	
	



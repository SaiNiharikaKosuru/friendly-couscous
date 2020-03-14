package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;




public class RBFConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("d://ctsdb.properties");
			Properties p=new Properties();
			 p.load(fis);
			 
			String dname=(String)p.get("Dname");
			String url=(String)p.get("URL");
			String username=(String)p.get("Uname");
			String password=(String)p.get("Pwd");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the table name");
			String tablename=sc.next();
			
			Class.forName(dname);
			System.out.println("Drivers loaded..");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection created...");
			
			//executing query
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from"+tablename);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			//printing column name
			System.out.println("==================================");
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println(rsmd.getColumnName(i)+"");
			}
			System.out.println("");
			System.out.println("======================================");
			//printing the data
			while(rs.next())
			{
				for(int j=1;j<=rsmd.getColumnCount();j++)
				{
					System.out.println(rs.getString(j)+"");
				}
				System.out.println(" ");
			}
		
			
			
			
			
			
		}
		catch(Exception e) {

	}

}
}

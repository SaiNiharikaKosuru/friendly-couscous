package ioStreams;
import java.io.*;


public class ReadEmployeeData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double Total=0.0;
		FileInputStream fis=new FileInputStream("d://emp1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream in=new DataInputStream(bis);
		
		try
		{
			while(true)
			{
				int eno=in.readInt();
				String ename=in.readUTF();
				double sal=in.readDouble();
				Total=Total+sal;
				
				System.out.println("Emp no:"+eno);
				System.out.println("Emp name:"+ename);
				System.out.println("Emp sal:"+sal);
			}
		}
		

	}

}

package ioStreams;
import java.io.*;
public class WriteEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("d://emp.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream out=new DataOutputStream(bos);
		
		out.write(1);
		out.writeUTF("Nikki");
		out.writeDouble(5000.0);
		
		out.write(2);
		out.writeUTF("Nikks");
		out.writeDouble(6000.0);
		
		out.write(3);
		out.writeUTF("Niha");
		out.writeDouble(7000.0);
		
		System.out.println("Objects written to files");
	
		

	}

}

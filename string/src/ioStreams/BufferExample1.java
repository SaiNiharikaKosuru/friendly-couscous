package ioStreams;
import java.io.*;

public class BufferExample1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try (
		InputStreamReader ipr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ipr))
{
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("Enter your city");
		String city=br.readLine();
		System.out.println("The name is:"+name);
		System.out.println("The city is:"+city);
}

	}

}

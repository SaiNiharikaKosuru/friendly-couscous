package ioStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class BufferExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (
				InputStreamReader ipr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(ipr))
		{
				System.out.println("Enter marks of first subject");
				int m1=Integer.parseInt(br.readLine());
				System.out.println("Enter marks of second subject");
				int m2=Integer.parseInt(br.readLine());
				System.out.println("Enter marks of third subject");
				int m3=Integer.parseInt(br.readLine());
				int total=(m1+m2+m3);
				int avg=(total/3);
				System.out.println("The total is:"+total);
				System.out.println("The average is:"+avg);
		}

	}

}

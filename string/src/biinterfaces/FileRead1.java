package biinterfaces;
import java.io.*;
import java.util.*;

public class FileRead1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (
		    InputStreamReader fis=new InputStreamReader(System.in);
			FileOutputStream out = new FileOutputStream("D:\\hai.txt");){
			System.out.println("Enter characters,Enter 'q' to quit");
			
			char ch;
			do {
				ch=(char)fis.read();
				out.write(ch);
			}while(ch!='q');
			
					
		}
		

	}

}

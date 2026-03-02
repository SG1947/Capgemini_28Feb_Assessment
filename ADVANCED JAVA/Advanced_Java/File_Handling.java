+++++package Advanced_Java;
import java.util.stream.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class File_Handling {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\SOUMILI GHOSH\\Downloads\\java.txt");
//		System.out.println(f.createNewFile());
//		System.out.println(f.delete());
		if(f.exists()) {
			System.out.println("File already present");
		}
		else {
			f.createNewFile();
			System.out.println("File Created successfully");
		}
		FileInputStream fs=new FileInputStream(f);
		
		int count;
		while((count=fs.read())!=-1) {
			System.out.print((char)count);
		}
		System.out.println();
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			System.out.print(sc.nextLine());
			
		}
		System.out.println();
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String st1="";
		String st2="";
		while((st1=br.readLine())!=null) {
			st2=st2+st1;
		}
		System.out.print(st2);

    
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		String s1="Hi";
		bw.write(s1);
		
		
		FileReader fr1=new FileReader(f);
		BufferedReader br1=new BufferedReader(fr);
		System.out.println(br1.readLine());
		
		bw.close();
		
		
	}

}

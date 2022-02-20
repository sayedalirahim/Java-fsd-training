package java_training;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File_cpy {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file name ");
		String sfile = sc.next();
		System.out.println("Enter Destination file name ");
		String dfile = sc.next();
		FileReader fr = new FileReader(sfile);
		FileWriter fw = new FileWriter(dfile);	
		int c;
		while((c = fr.read())!=-1)
		{
			fw.write(c);
		}
		System.out.println("copy finish");
		fr.close();
		fw.close();
	}}



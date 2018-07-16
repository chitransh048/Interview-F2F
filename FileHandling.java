import java.util.*;
import java.io.*;

public class JCF {

	public static void main(String[] args)  throws IOException{
		File f1 = new File("C:\\Users\\DELL\\eclipse-workspace\\practise.txt");
		FileWriter fr = new FileWriter(f1);
		String str = "Hey whats your rahsi...fruit ";
		fr.write(str);
		fr.close();
		
		File F2 = new File("C:\\Users\\DELL\\eclipse-workspace\\practise.txt");
		FileReader fread = new FileReader(F2);
		BufferedReader br = new BufferedReader(fread);
		String s = "";
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
		fread.close();
		
	}
}

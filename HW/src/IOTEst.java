import java.io.*;
public class IOTEst {

	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¬ведите символы, 'стоп'  - дл€ выхода");
		do {
			str= br.readLine();
			System.out.println(str);}
		while (!str.equals("стоп"));
		
		}
	}



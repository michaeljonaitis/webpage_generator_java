import java.io.*;



public class runner {
	public static void main(String[] args) throws IOException {
		
		File outfile = new File("mypage.html");
		File infile = new File("mycode.txt");
		FileReader filereader = new FileReader(infile);
		FileWriter filewriter = new FileWriter(outfile);
		BufferedWriter out = new BufferedWriter(filewriter);
		BufferedReader in = new BufferedReader(filereader);
		
		Parser parser = new Parser(in);

		Interpreter inter = new Interpreter(parser.list, out);
		inter.Interperate();
		out.close();
		
		
		
	}

}

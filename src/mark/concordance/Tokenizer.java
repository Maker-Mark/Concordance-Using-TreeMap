package mark.concordance;
import java.util.*;
import java.io.*;
public class Tokenizer {

	//Using public data members to minimize setters/getters
	//in this demo program (not to be used in user-based programs) 
	public Token tok;
	public Scanner sc;
	public String file;
	public int num;

	// Constructor
	public Tokenizer(String fileName) throws FileNotFoundException {
		sc = new Scanner(new File("/Users/Mark/Google Drive/EclipseSpr19/Homework3/src/mark/concordance/" + fileName)); //
		file = fileName;
		tok = new Token(fileName, sc.next(), 0);
		num = 0;
	}
	
	public Token next() {
		num++;
		return new Token(file, sc.next(), num );

	}

	public boolean hasNext() {
		return sc.hasNext();
	}
	
}

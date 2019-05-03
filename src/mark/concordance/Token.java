package mark.concordance;

/**
 * Class Token stores information about a word, specifically,
 * where it can be found within the "book", which , in this case, 
 * will be a file.
 * @author Mark
 *
 */
public class Token {
	
	//Using public data members to minimize setters/getters
	//in this demo program (not to be used in user-based programs)
	public String fileName;
	public String word;
	public int wordNum;
	//Data member wordNum keeps tract of where the word is
	//ie in the file with "apple is good", for word "is"
	// wordNum = 2, word = "is"

	//Constructor that sets the token's word to the received string.
	//Used if you wanted to test the program by making a dummy Token.
	public Token(String str) {
		word = str;	
	}

	public Token(String fileName, String word, int wordNum  ) {
		this.fileName = fileName;
		this.word = word;
		this.wordNum = wordNum;

	}

	public String toString() {
		return String.format("In file \"%s\" String \"%s\" is in postion %d", fileName, word, wordNum);
	}
	
	public String toString(Token t, boolean a) {
		return String.format("Postion %d", fileName, word, wordNum);
	}

	public String getFile() {
		return this.fileName;
	}

}

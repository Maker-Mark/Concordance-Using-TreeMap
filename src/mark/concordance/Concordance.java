package mark.concordance;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/**
 * A concordance is a book that gives you a listing of another books words and where they appear.
 * 
 * Class concordance will mimic a book, of these entries.
 * @author Mark
 *
 */
public class Concordance {

	//Using public data members to minimize setters/getters
	//in this demo program (not to be used in user-based programs)
	public Map<String, List<Token>> map;
	public List<Token> list;
	public String file;

	public Concordance() {
		map = new TreeMap<>();
	}
	
	// Opens a file and adds all Tokens to the map.
	public void add(String file) throws FileNotFoundException {
		this.file = file;
		Tokenizer tok = new Tokenizer(file);
		Token token = tok.next();
		while(tok.hasNext()) {
			if(map.containsKey(token.word)) {
				map.get(token.word).add(token);
			}else{ 
				list = new ArrayList<Token>();
				list.add(token);
				map.put(token.word, list);
			}
			token = tok.next();
		}
	}


	public int count(String a) {
		if(map.get(a)!=null) {
			return map.get(a).size();
		}
		else return -1;
	}

	public String toString() {
        String temp = "";
        
        for (Map.Entry<String, List<Token>> entry: map.entrySet()) {
            temp = temp + "" + entry.getKey() + " occurs " + count(entry.getKey()) + " time(s).  Here are its occurences: \n";
            for (Token token: entry.getValue()) {
                temp = temp + token + "\n";
            }
            temp = temp + "\n";
        }
        return String.format(temp);
    }
	
	
	public String getFile() {
		return file;
	}


}

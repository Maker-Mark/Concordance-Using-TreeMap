package mark.concordance;

import java.io.*;
import java.util.*;
import java.util.Map.*;
public class DriverPgrm {

	public static void main(String[] args) throws FileNotFoundException {
		Concordance con = new Concordance();
		con.add("homework3.txt"); //Add "book"/file to the concordance
		System.out.println(con);
	}
}

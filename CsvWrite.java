package Csv;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CsvWrite {

	public static void main(String[] args) throws Throwable {
		CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\ss22055\\eclipse-workspace\\Demo\\newfolder\\wwwritte.csv"));
		String a[]= {"a","b","c","d","e"};
		String b[]= {"f","g","h","i"};
		write.writeNext(a);
		write.writeNext(b);
		write.flush();
		System.out.println("success");

	}

}

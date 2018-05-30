package edu.handong.csee.java.hw3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * WriteCSV is write the all name and message number
 * using the hashmap read all name and that ArrayList number write the result
 * 
 * @author ���ع�
 *
 */
public class WriteCSV{
	public void createCSV(ArrayList<String> result,String outputpath){

		try{
			//PrintWriter pw = new PrintWriter(new OutputStreamWriter(out, "UTF-8"));
			//CSVWriter cw = new CSVWriter(new FileWriterWithEncoding(fileName,"euc-kr"),  ',');
			//BufferedWriter fw = new BufferedWriter(new FileWriter("C:\\Users\\imsuj\\Desktop\\out.csv", true));
			FileOutputStream fileOutputStream = new FileOutputStream(outputpath);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "MS949");
			BufferedWriter fw = new BufferedWriter(outputStreamWriter);
			for(String line : result){
				System.out.println(line);
				fw.write(line+"\n");
			}
			fw.flush();
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
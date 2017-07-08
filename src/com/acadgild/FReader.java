package com.acadgild;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Task: Copy file data onto another file, and show output on Display.
 */
public class FReader {
	
	public static void main(String[] args) throws IOException {//Throwing IO exception since it's a possibility
	     
		//Setting up the reader and the file it needs to read from
		FileReader thisFile = new FileReader("C:/Users/Obeng/workspace/S8_A1/src/com/acadgild/file");
		BufferedReader input = new BufferedReader(thisFile);
		
		/*
		 * Collector will hold next line from 'file' and make available to be written
		 * into new file, and printed to Screen
		 */
	    String collect;
	      //Setting up the writer and the file it needs to write to.
	    FileWriter thatFile = new FileWriter("C:/Users/Obeng/workspace/S8_A1/src/com/acadgild/fileOut");
	    BufferedWriter output = new BufferedWriter(thatFile);
	      
	    //for every line, this loop will take a line from input file and record it into output file
	      while ((collect = input.readLine()) != null) {
				output.write(collect);		//Write line stored in collect to output file
				output.newLine();			//Go to next line in output file.
	    	  // display line in collect
				System.out.println(collect);
	      }
	      
	      //Close io tools
	      input.close();
	      output.close();
	 }

}

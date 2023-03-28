package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\matheus.marano\\eclipse-workspace\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			bw.newLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

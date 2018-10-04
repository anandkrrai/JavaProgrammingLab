package clg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandlingExp5 {

	public static void main(String[] args) throws IOException {
//		String str = "hello world";
//
//		FileWriter fileWriter = new FileWriter("text.txt");
//		for (int i = 0; i < str.length(); i++) {
//			fileWriter.write(str.charAt(i));
//		}
//		fileWriter.close();

		FileWriter fileWriter = new FileWriter("temp.txt");
		int ch;

		FileReader fileReader = null;
		try {
			fileReader = new FileReader("text.txt");

			while (true) {
				ch = fileReader.read();

				if (ch == -1) {
					break;
				}
				if (ch > 64 && ch <= 90)
					ch += 32;
				fileWriter.write(ch);
			}
			fileReader.close();
			fileWriter.close();

		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}

	}

}

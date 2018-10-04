package clg;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exp5 {

	public static void main(String[] args) throws IOException {
		File file = new File("text.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
		randomAccessFile.seek(0);
		int ch = 0;
		int pointer = 0;

		while (ch != -1) {
			ch = randomAccessFile.read();

			if (ch > 64 && ch <= 90) {
				randomAccessFile.seek(pointer);
				ch += 32;
				randomAccessFile.write(ch);
			}
			++pointer;
		}
		randomAccessFile.close();
	}

}

package Lab05;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File textFile = new File("/home/abhishek/IdeaProjects/JavaProgrammingLab/src/sample_text.txt");
        OutputStream out = null;

        try {
            FileInputStream input = new FileInputStream(textFile);
            InputStreamReader inputReader = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(inputReader);

            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line.toUpperCase());
            }

            out = new FileOutputStream(textFile);
            out.write(builder.toString().getBytes(), 0, builder.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

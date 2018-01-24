package com.poc.jp.streams;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToFile {

	// To create folder we have to create top level structure and then create file
	private static final String FILENAME = "E:\\test\\filename.txt";

	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String data = " This is new content";

			File file = new File(FILENAME);
			// mkdirs will create tree folder structure
			file.getParentFile().mkdirs();
			// if file doesnt exists, file will be created
			if (!file.exists()) {
				
				
				file.createNewFile();
			}

			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			bw.write(data);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

	}


}

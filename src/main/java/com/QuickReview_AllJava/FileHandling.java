package com.QuickReview_AllJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {

		String fileName = "players.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

}

// This example demonstrates the use of the BufferedReader class in Java to read
// data from a file. The BufferedReader class is used here to wrap a FileReader
// object, which is used to open the file. The file is read line by line using
// the readLine method, and each line is printed to the console. If there is an
// error reading the file, an exception is caught and an error message is
// printed to the console.

//Note that in this example, the file players.txt should be located in the same directory as the Java file.

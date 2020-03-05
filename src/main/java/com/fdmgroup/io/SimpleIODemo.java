package com.fdmgroup.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleIODemo {

	private static Logger LOGGER = LogManager.getLogger(SimpleIODemo.class);

	public static void main(String[] args) {

		String filename = "./message.txt";
		writeMessageTOFile(filename, true, "Go to shops");
		writeMessageTOFile(filename, true, "Buy milk");
		writeMessageTOFile(filename, true, "Pickup parcel");
	}

	public static void writeMessageTOFile(String filename, boolean append, String message) {
		try (Writer writer = new FileWriter(filename, append); BufferedWriter bufferedWriter  = new BufferedWriter(writer);) {
			bufferedWriter.write(message + "\n");
		} catch (IOException e) {
			LOGGER.error("Error write file {0}", e);
		
		}

	}

}

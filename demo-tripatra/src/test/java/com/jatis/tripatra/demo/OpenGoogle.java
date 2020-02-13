package com.jatis.tripatra.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenGoogle {
	
	private static final Logger log = LoggerFactory.getLogger(OpenGoogle.class);

	public static void main(String[] args) throws IOException {
		URL googleUrl = new URL("https://www.google.com");
		InputStream input = googleUrl.openStream();
		
		//Read from google and print to standard output
		BufferedReader read = new BufferedReader(new InputStreamReader(input));
		try {
			String line = read.readLine();
			while (line != null) {
				System.out.println(line);
				line = read.readLine();
			}
		} catch (IOException e) {
			log.warn("Error", e);
		} finally {
			read.close();
		}
	}
	
	public void writeSomething() throws Exception {
		throw new Exception("Ada yg salah");
	}

}

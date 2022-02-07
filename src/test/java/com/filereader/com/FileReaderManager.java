package com.filereader.com;

import java.io.IOException;




public class FileReaderManager {
private FileReaderManager() {
		
	}
	public static FileReaderManager getInstanceFRM() {
		FileReaderManager frm1= new FileReaderManager();
		return frm1;
	}
	public ConfigReader getInstanceCR() throws IOException {
		ConfigReader reader = new ConfigReader();
		return reader;
	}

}

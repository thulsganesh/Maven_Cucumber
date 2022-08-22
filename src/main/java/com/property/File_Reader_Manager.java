package com.property;

import java.io.IOException;

public class File_Reader_Manager {
	
	//private COnstructor
	
	private File_Reader_Manager() {
		
		//We cannot create object in another class. So, Empty Private constructor will create.
		
	}
	
	//Configuration Reader Object Creating in a File Reader Manager
	
	public Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader cr= new Configuration_Reader();
		
		return cr;
		
	}

	public static File_Reader_Manager getInstanceFRM() {
		
		File_Reader_Manager frm = new File_Reader_Manager();
		
		return frm;
		
	}

}

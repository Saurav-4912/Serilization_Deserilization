package com.tca.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.tca.entities.Student;

public class DesrializableDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("resources/Student.txt");
			ois = new ObjectInputStream(fis);
			
			Student student = (Student) ois.readObject();
			
			student.display();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
				fis.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

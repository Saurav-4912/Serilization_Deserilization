package com.tca.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.tca.entities.Student;

public class Demo {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("resources/Student.txt");
			oos = new ObjectOutputStream(fos);
			Student student = new Student(101, "AAA", 89);

			oos.writeObject(student);

			System.out.println("Object is serilized successfully");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

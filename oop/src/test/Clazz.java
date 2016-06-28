package test;

import java.lang.reflect.Field;

import school.StudentBean;

public class Clazz {
	public static void main(String[] args) {
		StudentBean b = new StudentBean();
	 try {
		Class c = Class.forName("school.StudentBean");
		Field[] m = c.getDeclaredFields();
		for(Field s : m){
			System.out.println(s.toString());
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}

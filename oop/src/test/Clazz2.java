package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import school.StudentBean;

public class Clazz2 {
	public static void main(String[] args) {
		try {
			Class b = (Class) Class.forName("java.lang.String").newInstance();
			Method[] m = b.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

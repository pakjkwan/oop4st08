package collection;

import java.util.List;
import java.util.Vector;

import school.StudentBean;

/**
 * @date   :2016. 6. 23. 
 * @author :pakjkwan@gmail.com
 * @file   :ListEx.java
 * @story  :
*/
public class VectorEx {
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>();
		
		StudentBean hong = new StudentBean("hong", "1", "홍길동", "800101-1");
		StudentBean kim = new StudentBean("kim", "1", "김유신", "900101-1");
		StudentBean lee = new StudentBean("lee", "1", "이순신", "010101-3");
		//자원추가
		v.add(hong);
		v.add(kim);
		v.add(lee);
		System.out.println("size : "+v.size());
	//	System.out.println(v.toString());
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).getName());
		}
		
	}
	
}

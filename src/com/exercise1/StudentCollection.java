package com.exercise1;

import java.util.ArrayList;

public class StudentCollection {

	public static void main(String[] args) {
		
		  ArrayList <Student> s= new ArrayList<>();
		  
		  s.add(new Student("rev",77,88,66));
		  s.add(new Student("gnan",55,57,70));
		  s.add(new Student("ram",40,68,56));
		  s.add(new Student("sam",70,78,66));
		  s.add(new Student("dam",60,48,76));
		  s.add(new Student("pam",49,68,56));
		  s.add(new Student("ham",29,38,66));
		  s.add(new Student("jam",29,38,46));
		  s.add(new Student("tam",49,38,66));
		  s.add(new Student("zam",79,68,76));
		  
		  //System.out.println(s);
           StudentDetailsPrint d = new StudentDetailsPrint();
           d.studentDetails(s);
		
}

}

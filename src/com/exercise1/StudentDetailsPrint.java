package com.exercise1;

import java.util.ArrayList;

public class StudentDetailsPrint {

	void studentDetails(ArrayList<Student> s) {
		System.out.println("**********************************");
		System.out.println("Students with Average >= 60");
	    System.out.println("**********************************");
			for(int i=0;i<s.size();i++) {
		if(s.get(i).average>=60) {
			System.out.println("Student Name:" + s.get(i).getName() + "  |   Student Total:" +s.get(i).getTotal());
		   }
		}
		System.out.println("**********************************");
		System.out.println("Students with Average > 50 && < 60");
		System.out.println("**********************************");
		for(int i=0;i<s.size();i++) {
		if(s.get(i).average >50 && s.get(i).average<60) {
			System.out.println("Student Name:" + s.get(i).getName() + "  |   Student Total:" +s.get(i).getTotal());
			
		}
		}
		System.out.println("**********************************");
		System.out.println("Students with Average <= 50");
		System.out.println("**********************************");
		for(int i=0;i<s.size();i++) {
		if(s.get(i).average<=50) {
			System.out.println("Student Name:" + s.get(i).getName() + "  |  Student Total:" +s.get(i).getTotal());
		}
	 }
	}
}

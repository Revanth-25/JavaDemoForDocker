

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentApp {

	
	void sortStudent(LinkedList<Student> l) {
		
		ArrayList<Student> a = new ArrayList<Student>();
		
		
		for(int j=0 ; j<l.size();j++) {
			if(l.get(j).average>=60) {
				//System.out.println(al);
//				l.remove(j);
				a.add(l.get(j));
				l.remove(j);
				
			}
		}
		System.out.println("Total number of Students with average >= 60 :");
		System.out.println(a.size());
		
		System.out.println("Total number of Students with average < 60 :");
		System.out.println(l.size());
		
//		System.out.println(a);
		
	}
}

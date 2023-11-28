
import java.util.LinkedList;


public class MyCollection 
{

	public static void main(String[] args) {
	
//		int a,c;
//		String b;
		
		LinkedList<Student> l = new LinkedList<Student>();
		//ArrayList<Student> s = new ArrayList<Student>();
		
		
		  l.add(new Student("rev",77,88,66));
		  l.add(new Student("gnan",55,57,70));
		  l.add(new Student("ram",40,68,56));
		  l.add(new Student("sam",70,78,66));
		  l.add(new Student("dam",53,53,56));
		  l.add(new Student("pam",49,68,56));
		  l.add(new Student("ham",29,38,66));
		  l.add(new Student("jam",29,38,46));
		  l.add(new Student("tam",49,38,66));
		  l.add(new Student("zam",79,68,76));
		  
	    
//		System.out.println("Enter number of Students");
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		for (int i=0;i<n;i++) {
//			System.out.println("Enter Id");
//			a = sc.nextInt();
//			System.out.println("Enter name");
//			b = sc.next();
//			System.out.println("Enter percentage");
//			c = sc.nextInt();
//			
//			l.add(new Student(a,b,c));
//		}
//		System.out.println(l);
		
//		for(int j=0 ; j<l.size();j++) {
//			if(l.get(j).percentage>=60) {
//				//System.out.println(al);	
//				a1.add(l.get(j));
//			}
//
//		}
//		System.out.println(a1);
		StudentApp st = new StudentApp();
		st.sortStudent(l);
	}
}

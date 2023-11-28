

public class Student {
      String name;
      double marks1;
      double marks2;
      double marks3;
      double total;
      double average;

      
      
      Student(String name,double marks1,double marks2,double marks3){
    	  this.name=name;
    	  this.marks1=marks1;
    	  this.marks2=marks2;
    	  this.marks3=marks3;
          this.total = marks1+marks2+marks3;
          this.average = total/3;
    	  
 
      }
      
      public String toString() {
    	  return "Student Name:" +name+ " | Marks1:" +marks1+" | Marks2:"+marks2+" | Marks3:"+marks3+ " | Total:"+total;
      }
}

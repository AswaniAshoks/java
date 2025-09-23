class Student{  
int rollno;  
String name;  
float percentage;  
public String getname() {
    return name;
  }
  public void setname(String n) {
    this.name = n;
  }
  public int getrollno() {
    return rollno;
  }
  public void setrollno(int r) {
    this.rollno = r;
  }
  public float getpercentage() {
    return percentage;
  }
  public void setpercentage(float p) {
    this.percentage = p;
  }
}
  
class studentprofile{  
public static void main(String args[]){  
Student s1=new Student();  
s1.setname("Aswani") ; 
s1.setrollno(4);
s1.setpercentage(98);

System.out.println("Student name: " + s1.getname());
        System.out.println("Roll Number: " + s1.getrollno());
        System.out.println("Mark percentage: " + s1.getpercentage());
}}  
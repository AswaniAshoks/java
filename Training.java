class Course
{ 
	String coursename; 
	String duration; 
public static int count=0;
public final String trainingcentername="Mashupstack";
	Course() 
	{ 
                 coursename = "javafullstack";
                 duration = "6month";
                 count++; 
	} 
    Course(String coursename, String duration)
    {
        this.coursename=coursename;
        this.duration=duration;
        count++;
    }
    class CourseMaterial{
        public static void information () 
	{ 
		System.out.println("Materials provided for this course."); 
 		 
    }
} 
class Training{  
public static void main(String args[]){  
Course c1=new Course("Pythonfullstack","8months"); 
Course c2=new Course();   


System.out.println("Course Name: " + c1.coursename + ", Duration: " + c1.duration + ", Training Center: " + c1.trainingcentername);
        System.out.println("Course Name: " + c2.coursename + ", Duration: " + c2.duration + ", Training Center: " + c2.trainingcentername);
        System.out.println("Total Course Count: " + Course.count);     
}
}}  
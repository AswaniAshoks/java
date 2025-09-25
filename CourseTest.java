class course {
    private String courseName;
    private int durationWeeks;
    private int studentCount;
    public static int totalStudents = 0; 
    public final String CREATOR = "Mashupstack";


    public course(String courseName, int durationWeeks, int studentCount) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
        this.studentCount = studentCount;
        totalStudents += studentCount;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (weeks): " + durationWeeks);
        System.out.println("Students Enrolled: " + studentCount);
        System.out.println("Course Creator: " + CREATOR);
        System.out.println();
    }

    public static class Platform {
        public static void showPlatformMessage() {
            System.out.println("Courses are hosted on Mashupstack");
        }
    }
}

public class CourseTest {
    public static void main(String[] args) {
        
        course c1 = new course("Javafullstack", 20, 49);
        course c2 = new course("MernStack", 21, 48);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        System.out.println("Total Students Enrolled (All Courses): " + course.totalStudents);
        course.Platform.showPlatformMessage();
    }
}

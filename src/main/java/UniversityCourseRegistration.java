public class UniversityCourseRegistration {

public static void main(String[] args) {

Student student = new Student(139,"Hassan","Software Engineering");

Course course = new Course("SCD","Software Construction and Development",3);

student.displayStudent();

System.out.println();

course.displayCourse();
}
}
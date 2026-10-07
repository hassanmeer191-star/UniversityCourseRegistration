public class Registration {

private Student student;
private Course course;

public Registration(Student student, Course course) {
this.student = student;
this.course = course;
}

public void displayRegistration() {
System.out.println("===== Registration Information =====");

student.displayStudent();

System.out.println();

course.displayCourse();
}

public void displayConfirmation() {
System.out.println();
System.out.println("Registration Successful!");
System.out.println("The student has been registered for the course.");
}
}
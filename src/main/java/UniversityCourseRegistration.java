public class UniversityCourseRegistration {

public static void main(String[] args) {

Student student = new Student(
139,
"Hassan",
"Software Engineering"
);

Course course = new Course(
"SCD",
"Software Construction and Development",
3
);

Registration registration = new Registration(
student,
course
);

registration.displayRegistration();
registration.displayConfirmation();
}
}
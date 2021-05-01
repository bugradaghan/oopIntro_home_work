package oopIntroHomework;

public class CourseManager {
	public void finishToCourse(Course course) {
		System.out.println("Biten kurslara eklendi.Kursun Adý " + course.courseName);
		
	}
	
	public void changeTeacher(Course course) {
		System.out.println("Kursun Öðretmeni Deðiþti. Yeni Eðitmen " + course.teacher);
		
	}

}

package oopIntroHomework;

public class CourseManager {
	public void finishToCourse(Course course) {
		System.out.println("Biten kurslara eklendi.Kursun Ad� " + course.courseName);
		
	}
	
	public void changeTeacher(Course course) {
		System.out.println("Kursun ��retmeni De�i�ti. Yeni E�itmen " + course.teacher);
		
	}

}

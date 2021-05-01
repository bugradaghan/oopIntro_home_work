package oopIntroHomework;

public class MainHw {

	public static void main(String[] args) {
		
		Course course1= new Course(1,"C#+ Angular","Engin Demirog",0);
		
		Course course2 = new Course();
		course2.id=2;
		course2.courseName="JAVA + React";
		course2.teacher="Engin Demirog";
		course2.completionAmount=40;
		
		Course course3= new Course(3,"Programlamaya Giriş İçin Temel Klavuz","Engin Demirog",0);
		
		Course[] courses= {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.id+ " " + course.courseName );
			System.out.println("Tamamlanma Yüzdesi:" + course.completionAmount);
			
			}
		CourseManager courseManager = new CourseManager();
		courseManager.finishToCourse(course1);
		
		courseManager.finishToCourse(course2);
		
		courseManager.finishToCourse(course3);
		
		
		CourseManager courseManager2 = new CourseManager();
		
		courseManager.changeTeacher(course1);
		
		courseManager.changeTeacher(course2);
		
		courseManager.changeTeacher(course3);
		
		
		
		
		}

	
}


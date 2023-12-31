package Todo1;

import java.util.Collection;

public class CRUD_Main {

	private static void getAllCourse() {
		// TODO Auto-generated method stub
		DaoInterface<Course, Integer> idao = new CourseDao();
		Collection<Course> allData = idao.getAll();
		for(Course courseList: allData) {
			System.out.println(courseList);
		}
		
	}
	
	private static void getOneCourse() {
		// TODO Auto-generated method stub
		DaoInterface<Course, Integer> idao = new CourseDao();
		Course course = idao.getOne(103);
		if(course!=null) {
			System.out.println(course);
		}
		else {
			System.out.println("Id not found");
		}
	}
	
	private static void createCourse() {
		// TODO Auto-generated method stub
		DaoInterface<Course, Integer> idao = new CourseDao();
		Course newCourse = new Course(106,"Selenium", 30, "Coursera", 45000);
		idao.create(newCourse);
	}
	
	private static void deleteCourse() {
		// TODO Auto-generated method stub
		DaoInterface<Course, Integer> idao = new CourseDao();
		idao.delete(106);
	}
	
	private static void updateCourse() {
		// TODO Auto-generated method stub
		DaoInterface<Course, Integer> idao = new CourseDao();
		Course course = idao.getOne(104);
		course.setProvider("Edubridge");
		course.setDuration(40);
		idao.update(course);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getOneCourse();
//		createCourse();
//		deleteCourse();
		updateCourse();
		getAllCourse();

	}
}

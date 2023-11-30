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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getAllCourse();
		getOneCourse();
	}

	
}

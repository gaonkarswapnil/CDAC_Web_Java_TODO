package Todo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class CourseDao implements DaoInterface<Course, Integer> {

	@Override
	public Collection<Course> getAll() {
		// TODO Auto-generated method stub
		String sqlQuery = "select courseId, title, duration, provider, fees from course";
		Collection<Course> allCourse = new ArrayList<>();
		try(Connection conn = JdbcUtils.doConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery)) {
			while(rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int duration = rs.getInt(3);
				String provider = rs.getString(4);
				int fees = rs.getInt(5);
				
				Course course = new Course(id, title, duration, provider, fees);
				allCourse.add(course);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return allCourse;
	}

	@Override
	public Course getOne(Integer id) {
		// TODO Auto-generated method stub
		String subQuery = "select courseId, title, duration, provider, fees from Course where courseId=?";
		Course foundCourse = null;
		
		try(Connection conn = JdbcUtils.doConnection();
				PreparedStatement pstmt = conn.prepareStatement(subQuery)) {
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int courseId = rs.getInt(1);
				String title = rs.getString(2);
				int duration = rs.getInt(3);
				String provider = rs.getString(4);
				int fees = rs.getInt(5);
				foundCourse = new Course(courseId, title, duration, provider, fees);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return foundCourse;
	}

	@Override
	public void create(Course newCourse) {
		// TODO Auto-generated method stub
		String subQuery = "insert into course(courseId, title, duration, provider, fees) values (?,?,?,?,?)";
		
		try(Connection conn = JdbcUtils.doConnection();
				PreparedStatement pstmt = conn.prepareStatement(subQuery)) {
			int courseId = newCourse.getCourseId();
			String title = newCourse.getTitle();
			int duration = newCourse.getDuration();
			String provider = newCourse.getProvider();
			int fees = newCourse.getFees();
			
			pstmt.setInt(1, courseId);
			pstmt.setString(2, title);
			pstmt.setInt(3, duration);
			pstmt.setString(4, provider);
			pstmt.setInt(5, fees);
			int count = pstmt.executeUpdate();
			System.out.println(count+" record added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

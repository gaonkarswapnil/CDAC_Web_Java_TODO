package Todo1;

public class Course {
	int courseId, duration, fees;
	String title, provider;
	public Course() {
	}
	public Course(int courseId, String title, int duration, String provider, int fees) {
		this.courseId = courseId;
		this.duration = duration;
		this.fees = fees;
		this.title = title;
		this.provider = provider;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", duration=" + duration + ", fees=" + fees + ", title=" + title
				+ ", provider=" + provider + "]";
	}
	
}

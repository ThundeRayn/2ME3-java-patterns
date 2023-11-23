package Tutorial.observerCourse;

public class Student implements Observer {

	String name;
	Course course;
	String courseAnnouncment;
  
	public Student(String name, Course course) {
	  this.name = name;
	  this.course = course;
	  enroll();
	}
  
	public void enroll() {
	  System.out.println(name + " Enrolled in " + course.getCourseName());
	  course.add(this);
	}
  
	public void drop() {
	  course.remove(this);
	  System.out.println(name + " dropped " + course.getCourseName());
	}
  
	public void seeAnnoucment() {
	  System.out.println(name + ": " + courseAnnouncment);
	}
  
	@Override
	public void update() {
	  courseAnnouncment = course.getAnnouncement();
	  seeAnnoucment();
	}
  
}
  
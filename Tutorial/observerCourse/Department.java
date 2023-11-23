package Tutorial.observerCourse;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<String> departmentCourses = new ArrayList<String>();

	public Department(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return name;
	}

	public void addCourse(String course) {
		departmentCourses.add(course);
	}

	public ArrayList<String> getCourses() {
		return departmentCourses;
	}
}

package Tutorial.observerCourse;

import java.util.ArrayList;

public class Course implements Subject {

  String courseName;
  String courseAnnouncement; // state
  ArrayList<Observer> students; // state observers

  public Course(String courseName) {
    this.courseName = courseName;
    courseAnnouncement = "";
    students = new ArrayList<Observer>();
  }

  @Override
  public void add(Observer o) {
    students.add(o);
  }

  @Override
  public void remove(Observer o) {
    students.remove(o);
  }

  @Override
  public void update() {
    for (Observer o : students)
      o.update();
  }

  public void setAnnouncement(String a) {
    courseAnnouncement = a;
    update();
  }

  public String getAnnouncement() {
    return courseAnnouncement;
  }

  public String getCourseName() {
    return courseName;
  }

}

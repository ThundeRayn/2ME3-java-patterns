package Tutorial.observerCourse;

public class RunnerCourse {
        public static void main(String[] args) {
          Course _2ME3 = new Course("2ME3");
          Student jaden = new Student("Jaden", _2ME3);
          jaden.enroll();
          _2ME3.setAnnouncement("Welcome to 2ME3!");
          Student x = new Student("x", _2ME3);
          x.drop();
          _2ME3.setAnnouncement("Midterm next week!");
        }
      
}

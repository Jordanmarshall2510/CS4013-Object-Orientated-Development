import java.util.Arrays;

public class Course {
  private String courseName;
  private String[] students = new String[4];
  private int numberOfStudents = 0;
  private String [] studentsNew;
  
  /** Course Name */
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  /** Add Student */
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    if(students.length == numberOfStudents){
      studentsNew = new String [students.length *2];
    }
    numberOfStudents++;
  }
  
  /** Array of Students */
  public String getStudents() {
    String arrayPrint = Arrays.toString(students);
    return arrayPrint;
  }

  /** Number of Students */
  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  /** Get Course Name */
  public String getCourseName() {
    return courseName;
  }  
  
  /** Drop Student */
  int index;
  public void dropStudent(String student) {
    
    for (int i=0;i<students.length;i++) {
      if (students[i] == student) {
        index = i;
      }
    }
    students[index] = null;
    numberOfStudents--;
  }

  /** Remove All Student */
  public void removeAll(){
    for (int i=0;i<students.length;i++) {
      students [i] = null;
    }
  }
}
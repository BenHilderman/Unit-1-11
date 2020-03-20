import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class studentInfo.
 * @author  BenHilderman
 * @version 1.0
 * @since 2020-03-15 
 */

enum SchoolGrades {

  // Grades Jk to Grade twelve
  JK("Junior Kindergarten"),
  SK("Senior Kindergarten"),
  ONE("1"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  ELEVEN("11"),
  TWELVE("12");

  private final String userGrade;
  SchoolGrades(String userGrade) {
    this.userGrade = userGrade;
  }
  public String getGrade() {
    return this.userGrade;
  }
}

class Student {
  // Variables
  public SchoolGrades studentGrade;
  public boolean booleanIdentified;
  public String stringFirstName;
  public String stringLastName;
  public String stringMiddleInitial;
  public String stringBirthday;

  public Student(String firstName, String lastName, String middleInit,
  String birthday, SchoolGrades grade, boolean identified) {
    this.stringFirstName = firstName;
    this.stringLastName = lastName;
    this.stringMiddleInitial = middleInit;
    this.stringBirthday = birthday;
    this.studentGrade = grade;
    this.booleanIdentified = identified;
    
  }
}
public class studentInfo {
  public static void main(String[] args) throws IOException {
    // user inputs info
    boolean moreStudents = true;

    // Variables		
    String firstName;
    String lastName;
    String birthday;
    String middleInit;
    SchoolGrades grade;
    String gradeString;
    boolean identified = false;
    for (int counter = 0; moreStudents == true; counter++) {
      InputStreamReader r = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(r);

      System.out.println("Enter first name for student # " + (counter + 1) + ".");
      firstName = br.readLine();

      System.out.println("Enter last name for student # " + (counter + 1) + ".");
      lastName = br.readLine();

      System.out.println("Enter middle initial for student # " + (counter + 1) + ".");
      middleInit = br.readLine();

      System.out.println("Enter date of birth (DD/MM/YYYY) for student # " + (counter + 1) + ".");
      birthday = br.readLine();

      System.out.println("Enter grade in plain text (JK, SK, ONE, TWO, ... TWELVE) for student # " + (counter + 1) + ".");
      gradeString = br.readLine();
      grade = SchoolGrades.valueOf(gradeString.toUpperCase());

      System.out.println("Is student # " + (counter + 1) + " identified? Yes or No");

      if (br.readLine() == "Yes") {
        identified = true;
        
      }
      
      // Print Student Info		    
      System.out.println("Fist name: " + firstName + ". Middle initial: " + middleInit + ". Last name: " + lastName + ". Birthday: " + birthday + ". Grade: " + grade);
      Student currentStudent = new Student(firstName, lastName, birthday, middleInit, grade, identified);
      
    }
  }
}
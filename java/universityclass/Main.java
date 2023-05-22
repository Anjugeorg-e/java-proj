package universityclass;

public class Main {


  public static void testStudentSetID(){
    Student navya = new Student("Navya", 1);
    Faculty sam = new Faculty("Sam", 10);
    Course maths = new Course("Maths", sam);
    Department mathsDepartment = new Department("Maths");

    int given;
    int expected;
    int got;

    // test case1
    given =1;
    expected = 1;
    navya.setID(given);
    got = navya.getID();
    assert (got == expected) : "testID : Test 1 failed, " + " exp: " + expected + "but got: " + got;

    //test case 2
    given =-1;
    navya.setID(given);
    got = navya.getID();
    assert (got == expected) : "testID : Test 2 failed, " + " exp: " + expected + "but got: " + got;

  }

  public static void testFacultySetID(){
    Student navya = new Student("Navya", 1);
    Faculty sam = new Faculty("Sam", 10);
    Course maths = new Course("Maths", sam);
    Department mathsDepartment = new Department("Maths");

    int given;
    int expected;
    int got;

    // test case1
    given =10;
    expected = 10;
    sam.setID(given);
    got = sam.getID();
    assert (got == expected) : "testfacultyID : Test 1 failed, " + " exp: " + expected + "but got: " + got;

    //test case 2
    given =-1;
    sam.setID(given);
    got = sam.getID();
    assert (got == expected) : "testfacultyID : Test 2 failed, " + " exp: " + expected + "but got: " + got;

  }

  public static void testnoOfCourses() {

    Student navya = new Student("Navya", 1);
    Faculty sam = new Faculty("Sam", 10);
    Course maths = new Course("Maths", sam);
    Department mathsDepartment = new Department("Maths");

    int given;
    int expected;
    int got;

    // test case1
    expected = 1;
    navya.addStudentCourse(maths);
    got = navya.noOfCoursesEnrolled();
    assert (got == expected) : "setnoofcourses : Test 1 failed, " + " exp: " + expected + "but got: " + got;

  }

  public static void testNofCoursesTaught(){

    Student navya = new Student("Navya", 1);
    Faculty sam = new Faculty("Sam", 10);
    Course maths = new Course("Maths", sam);
    Department mathsDepartment = new Department("Maths");

    int given;
    int expected;
    int got;

    // test case1
    expected = 1;
    sam.addTaughtCourse(maths);
    got = sam.noOfCOursesTaught();
    assert (got == expected) : "setnoOfcourses : Test 1 failed, " + " exp: " + expected + "but got: " + got;

  }

  public static void testNoOfEnrolledCourse(){

    Student navya = new Student("Navya", 1);
    Faculty sam = new Faculty("Sam", 10);
    Course maths = new Course("Maths", sam);
    Department mathsDepartment = new Department("Maths");

    int given;
    int expected;
    int got;

    // test case1
    given =1;
    expected = 1;
    maths.addStudentToCourse(navya);
    got = maths.noOfEnrolledStudentsInCourse();
    assert (got == expected) : "setnoOfcourses : Test 1 failed, " + " exp: " + expected + "but got: " + got;

  }

  public static void testSetmark(){
    Student navya = new Student("Navya", 1);
    Faculty sam = new Faculty("Sam", 10);
    Course maths = new Course("Maths", sam);
    maths.addStudentToCourse(navya);


    double given;
    double expected;
    double got;

    // test case1
    given = 2.3;
    expected = 2.3;
    navya.setMark(given);
    got = navya.getMark();
    assert (got == expected) : "setMark : Test 1 failed, " + " exp: " + expected + "but got: " + got;

    //test case 2
    given = -1.2;
    navya.setMark(given);
    got = navya.getMark();
    assert (got == expected) : "setMark : Test 2 failed, " + " exp: " + expected + "but got: " + got;

  }

  public static void testAverageOfMarksInCourse(){
    Student navya = new Student("Navya", 1);
    Student neethu = new Student("Neethu", 2);
    Faculty sam = new Faculty("Sam", 10);
    Course maths = new Course("Maths", sam);
    maths.addStudentToCourse(navya);
    maths.addStudentToCourse(neethu);
    navya.setMark(4.5);
    neethu.setMark(8.5);

    double given;
    double expected;
    double got;

    // test case1
    
    expected = 6.5;
    got = maths.averageGradeOfStudentsInCourse();
    assert (got == expected) : "averageMar  : Test 1 failed, " + " exp: " + expected + "but got: " + got;

  }

  

  public static void main(String[] args) {

    Student navya = new Student("Navya", 1);
    Student neethu = new Student("Neethu", 2);
    Student Maya = new Student("Maya", 3);

    Faculty sam = new Faculty("Sam", 10);
    Faculty manu = new Faculty("Manu", 11);

    Course maths = new Course("Maths", sam);
    Course chemistry = new Course("Chemistry", sam);

    Department mathsDepartment = new Department("Maths");
    Department chemistrydepartment = new Department("Chemistry");
    University university = new University();

    navya.addStudentCourse(maths);
    navya.addStudentCourse(chemistry);
    Maya.addStudentCourse(chemistry);
    neethu.addStudentCourse(maths);

    
    // navya.removeStudentCourse(chemistry);

    System.out.println("Student navya enrolled in Courses : " +
    navya.coursesEnrolled);
    System.out.println("No of courses navya enrolled in: " +
    navya.noOfCoursesEnrolled());

    navya.removeStudentCourse(maths);
    System.out.println("Courses enrolled in: " + navya.getCourses());
    
    sam.addTaughtCourse(maths);
    manu.addTaughtCourse(chemistry);
    
    System.out.println("Courses taught by sam : " + sam.coursesTaught);
    
    sam.removeTaughtCourse(maths);
    System.out.println("Courses taught by sam : " + sam.coursesTaught);
    System.out.println("No of courses taught by sam : " +
    sam.noOfCOursesTaught());

    chemistry.addStudentToCourse(navya);
    chemistry.addStudentToCourse(neethu);
    chemistry.addStudentToCourse(Maya);

    maths.addStudentToCourse(Maya);

    System.out.println("Enrolled students in chemistry : " + chemistry.enrolledStudentsInCourse);
    

    // chemistry.removeStudentFromCourse(neethu);
    System.out.println("Enrolled students in chemistry : " +
    chemistry.enrolledStudentsInCourse);
    
    System.out.println("faculty memeber of chemistry : " +
    chemistry.getFacultyMember());

    maths.addStudentToCourse(navya);
    System.out.println("students enrolled in chemistry course: " +
    chemistry.enrolledStudentsInCourse);
    System.out.println("no of students enrolled: " +
    chemistry.noOfEnrolledStudentsInCourse());
    System.out.println(maths.getCourseName());
    System.out.println("students enrolled in maths course : " +
    maths.enrolledStudentsInCourse);
    System.out.println(maths.noOfEnrolledStudentsInCourse());
    
    System.out.println(mathsDepartment.getDepartmentName());
    mathsDepartment.addFacultyMemberInDepartment(sam);
    // mathsDepartment.removeFacultyMemberInDepartment(sam);

    System.out.println(mathsDepartment.listOfFacultyMembersInDepartment);
    mathsDepartment.addCoursesInDepartment(maths);
    mathsDepartment.addCoursesInDepartment(chemistry);

    // mathsDepartment.removeCoursesInDepartment(chemistry);
    System.out.println(mathsDepartment.coursesInDepartment);
    university.addDepartmentToList(mathsDepartment);

    System.out.println("Courses in department: " +
    mathsDepartment.coursesInDepartment);
    
    System.out.println(mathsDepartment.getCourseFromDepartment("Chemistry"));
    
    // System.out.println(mathsDepartment.getDepartmentame());

    university.addDepartmentToList(mathsDepartment);
    university.addDepartmentToList(chemistrydepartment);
    university.removeDepartmentFromList(chemistrydepartment);

    university.addFacultyMemebersFromList(manu);

    System.out.println(university.listOfFacultyMembers);
    System.out.println("departments in university : " +
    university.listOfDepartments);
    System.out.println( university.findDepartment("Maths"));

    university.removeDepartmentFromList(chemistrydepartment);

    navya.setMark(3.4);
    neethu.setMark(4.5);
    Maya.setMark(3.9);
    System.out.println("Cgpa of navya : " + navya.getMark()); 
    System.out.println("Cgpa of neethu : " + neethu.getMark()); 

  System.out.println("Average grade : " + chemistry.averageGradeOfStudentsInCourse());
  System.out.println(chemistry.noOfEnrolledStudentsInCourse());

  System.out.println("Average grade : " + maths.averageGradeOfStudentsInCourse());
  System.out.println(maths.noOfEnrolledStudentsInCourse());


    testnoOfCourses();
    testNofCoursesTaught();
    // testGetCourseFromDepartment();
    testStudentSetID();
    testFacultySetID();
    testSetmark();
    testAverageOfMarksInCourse();

    System.out.println("Test cases passed");

  }

}

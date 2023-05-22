package Schoolsystem;

import java.util.ArrayList;

 class Teacher extends Student{

    private int grade;
    private String name;
    private int age;
 
  
    private String teacher;
   

    

    ArrayList<String>newStudentsFirstGRade = new ArrayList<>();

    public Teacher(int age, String name,int grade, String teacher){
        super(age, name, grade);
        this.teacher = teacher;
    }

    public Teacher(){
      
    }
    public void newirstGradeAdmission(int age, String name){
        if(age >= 5){
           newStudentsFirstGRade.add(name);
      }
      System.out.println("New students in First Grade : " + newStudentsFirstGRade);
  
      }    
}

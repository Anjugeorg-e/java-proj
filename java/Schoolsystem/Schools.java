package Schoolsystem;

import java.util.ArrayList;

public class Schools {
    

   private int gradeOneFees = 20000;
   private int gradeTwoFees = 30000;
   private int gradeThreeFees = 30000;
   private int PendingFees;
   private int age;
   private String name;
   private int StudentId;

  

    // ArrayList<String>newStudentsFirstGRade = new ArrayList<>();


//constructor//

    public Schools(int age, String name){
        this.age = age;
        this.name = name;
        int grade = 1;

    }

//admission to first grade

    // public void newAdmission(int age){
    //   if(age >= 5){
    //      newStudentsFirstGRade.add(name);

    // }
    // System.out.println("New students in First Grade : " + newStudentsFirstGRade);

    // }

//update marks of a term exam





    public void calculateFees(int grade){
        if(grade == 1){
            System.out.println("Fees for grade 1 is: " + gradeOneFees);
        }else if(grade == 2){
            System.out.println("Fees for grade 2 is: " + gradeTwoFees);
        }else{
            System.out.println("Fees for grade 3 is: " +gradeThreeFees);
        }
    }



    public int PendingFees(){


        return PendingFees;
    }

    public void Marks(int langmark, int drawingmark, int craftmark){
        if((langmark >= 50) && (drawingmark >= 50) && (craftmark >= 50)){
            if(PendingFees == 0){
    
            }
        }
    
    
    }

   




}
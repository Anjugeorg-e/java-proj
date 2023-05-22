package Schoolsystem;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class Student{

protected int age;
protected String name;
protected int grade;
protected boolean isSingleParent;
protected int fees;
protected int gradeOneFee = 20000;
protected int gradefee = 30000;
protected double newFees;
protected double discount;

protected boolean isPaid;
public int languageAvg;
public int drawingAvg;
public int craftAvg;

public Student(){
}

public Student(int age, String name, int grade){
    this.age = age;
    this.name = name;
    this.grade = grade;
    
}
public Student(int age, String name){
          this.age = age;
          this.name = name;
}

public Student(int age, String name, int grade, boolean isSingleParent){
    this.age =  age;
    this.name = name;
    this.grade = grade;
}

public int getAge() {
    return age;
}
// public void setAge(int age) {
//     this.age = age;
// }
public String getName() {
    return name;
}
// public void setName(String name) {
//     this.name = name;
// }
public int getGrade() {
    return grade;
}
// public void setGrade(int grade) {
//     this.grade = grade;
// }
public boolean isSingleParent() {
    return isSingleParent;
}
// public void setSingleParent(boolean isSingleParent) {
//     this.isSingleParent = isSingleParent;
// }

public String toString(){
    return "Student{" + 
           " age : " + age + "," +
           " name : " + name + "," + 
            " grade : " + grade  +
            '}';
}

ArrayList<Integer>firsttermmark= new ArrayList<>();
ArrayList<Integer>secondtermmark = new ArrayList<>();
ArrayList<Integer>thirdtermmark = new ArrayList<>();

public int languageTotal;
public  int drawingTotal;
public int craftTotal;


public void firstTermMark(int language, int drawing, int craft){
    firsttermmark.add(language);
    firsttermmark.add(drawing);
    firsttermmark.add(craft);
    
    System.out.println("First Term Marks : " + firsttermmark);
}
public void secondTermMark(int language, int drawing, int craft){
    secondtermmark.add(language);
    secondtermmark.add(drawing);
    secondtermmark.add(craft);
    System.out.println("Second Term Marks : " + secondtermmark);
}
public void  thirdTermMark(int language, int drawing, int craft){
    thirdtermmark.add(language);
    thirdtermmark.add(drawing);
    thirdtermmark.add(craft);
    System.out.println("Third Term Marks : " + thirdtermmark);
}

public int languageSum(){
     languageTotal=  firsttermmark.get(0) + secondtermmark.get(0) + thirdtermmark.get(0);
     languageAvg = languageTotal/3;
     return languageAvg;
    // System.out.println("language sum : " + languageTotal);
}
public int drrawingSum(){
    drawingTotal = firsttermmark.get(1) + secondtermmark.get(1) + thirdtermmark.get(1);
    drawingAvg = drawingTotal/3;
    return drawingAvg;
    // System.out.println("drawing sum: " + drawingTotal);
} 
public int craftSum(){
    craftTotal = firsttermmark.get(2) + secondtermmark.get(2) + thirdtermmark.get(2);
    craftAvg = craftTotal/3;
    return craftAvg;
}



public void PassCondition(boolean isPaid){
    if((languageSum() >= 50) && (drrawingSum() >= 50) && (craftSum() >= 50) && (isPaid)){
       System.out.println("Average mark is above 50. passed");
       System.out.println("New grade is: " + (grade + 1));
    }else if((languageSum() >= 50) && (drrawingSum() >= 50) && (craftSum() >= 50) && (!isPaid)){
        System.out.println("Average mark is above  50 but fee is not paid. failed");
    }else{
        System.out.println("Average mark is beow 50. failed");
    }
}


public void feesStructure(int grade, boolean isSingleParent){
    if((grade == 1) && (!isSingleParent)){
        System.out.println("fees is : 20000");

    }else if(grade ==1 && (isSingleParent)){
        discount = (20000 * 0.2);
        newFees = (20000 - discount);
        System.out.println("fees is: " + newFees);
    }
    else if((grade == 2 || grade ==3) && (!isSingleParent)){
        System.out.println("fees is: 30000");
    }
    else if((grade ==2 || grade == 3) && (isSingleParent)){
        discount = (30000 * 0.2);
        newFees = (30000 - discount);
        System.out.println("fees is : " + newFees);
    }
}


}

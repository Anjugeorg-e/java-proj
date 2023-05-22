package Schoolsystem;


import java.util.ArrayList;

public class Students {

protected int age;
protected String name;
protected int grade;
protected boolean isSingleParent;


public Students(int age, String name, int grade){
    this.age = age;
    this.name = name;
    this.grade = grade;
    
}
public Students(int age, String name){
          this.age = age;
          this.name = name;
    }

public Students(int age, String name, int grade, boolean isSingleParent){
    this.age =  age;
    this.name = name;
    this.grade = grade;
}

public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getGrade() {
    return grade;
}
public void setGrade(int grade) {
    this.grade = grade;
}
public boolean isSingleParent() {
    return isSingleParent;
}
public void setSingleParent(boolean isSingleParent) {
    this.isSingleParent = isSingleParent;
}

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
protected int languageTotal,drawingTotal,craftTotal;


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
protected int languageAvg,drawingAvg,craftAvg;

public void languageSum(){
     languageTotal=  firsttermmark.get(0) + secondtermmark.get(0) + thirdtermmark.get(0);
    languageAvg = languageTotal/3 ;
    System.out.println("language sum : " + languageTotal);
}

public void drrawingSum(){
    drawingTotal = firsttermmark.get(1) + secondtermmark.get(1) + thirdtermmark.get(1);
    drawingAvg = drawingTotal/3;
    System.out.println("drawing sum: " + drawingTotal);
} 
public void craftSum(){
    craftTotal = firsttermmark.get(2) + secondtermmark.get(2) + thirdtermmark.get(2);
    craftAvg = craftTotal/3;
    System.out.println("craft sum : " + craftTotal);
}
public void PassCondition(){
    if((languageAvg >= 50) && (drawingAvg >= 50) && (craftAvg >= 50)){
       System.out.println("AVerage mark is above 50. passed");
    }else{
        System.out.println("Average mark is below 50. failed");
    }
}




}



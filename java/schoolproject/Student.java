package schoolproject;

import java.util.ArrayList;

public class Student {

    private String name;
    private String guardianName;
    private String gender;
    private boolean isSingleParent;
    private boolean isPaid;
    private int age;
    private int gradeName;
    private double languageTotal;
    private double drawingTotal;
    private double craftTotal;
    private double languageAvg;
    private double drawingAvg;
    private double craftAvg;

    ArrayList<Double> fistTermMark = new ArrayList<>();
    ArrayList<Double> secondTermMark = new ArrayList<>();
    ArrayList<Double> thirdTermMark = new ArrayList<>();

    Student(String name, int age, String gender, int gradeName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gradeName = gradeName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public boolean isSingleParent() {
        return isSingleParent;
    }

    public void setSingleParent(boolean isSingleParent) {

        this.isSingleParent = isSingleParent;
    }

    public boolean isPaid() {

        return isPaid;
    }

    public void setPaid(boolean isPaid) {

        this.isPaid = isPaid;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public int getGradeName() {
        return gradeName;
    }

    public void setGradeName(int gradeName) {
        this.gradeName = gradeName;
    }

    public double languageAverageMark() {

        languageTotal = this.fistTermMark.get(0) + this.secondTermMark.get(0) + this.thirdTermMark.get(0);
        languageAvg = languageTotal / 3;
        return languageAvg;

    }

    public double drrawingAverageMark() {
        drawingTotal = this.fistTermMark.get(1) + this.secondTermMark.get(1) + this.thirdTermMark.get(1);
        drawingAvg = drawingTotal / 3;
        return drawingAvg;

    }

    public double craftAverageMark() {
        craftTotal = this.fistTermMark.get(2) + this.secondTermMark.get(2) + this.thirdTermMark.get(2);
        craftAvg = craftTotal / 3;
        return craftAvg;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", gender=" + gender + "]";
    }

}

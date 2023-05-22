package Schoolsystem;
    import java.util.ArrayList;

 class Teachers extends Students{


    private int marks;
    private String teacher;
    ArrayList<String>newStudentsFirstGRade = new ArrayList<>();


    public Teachers(int age, String name,int grade, String teacher){
        super(age, name, grade);
        this.teacher = teacher;
 
    }

    

    public void PassCondition(){
        if((languageAvg >= 50) && (drawingAvg >= 50) && (craftAvg >= 50)){
           System.out.println("AVerage mark is above 50. passed");
        }else{
            System.out.println("Average mark is below 50. failed");
        }
    
    
    }



    
}

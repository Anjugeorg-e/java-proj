package gradetester;

import javax.lang.model.util.ElementScanner6;

public class Grader {
    
    public char determineLetterGrade(int numgrade){
        if(numgrade < 0){
             throw new IllegalArgumentException("number rade cannot be below 0");

        }
        else if(numgrade < 60){
            return 'F';
        }else if(numgrade<70){
            return 'D';
        }else if(numgrade<80){
            return 'C';
        }else if(numgrade<90){
            return 'B';
        }else{
            return 'A';
        }
    }
}

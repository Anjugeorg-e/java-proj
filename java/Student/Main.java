package Student;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main(String[] args) {
        
        // Student student = new Student();
        // Student student1 = new Student("anju");
        // System.out.println(student.name);
        // System.out.println(student1.name);


        // String name = "javaninja";
        // String reverse =" ";
    
        // for (int i=name.length()-1 ;i>=0;i--){
        //     reverse += name.charAt(i);
        // }
        // System.out.println(reverse);

    //swap 2 numbers
        // int i = 2;
        // int j=3;
        // int temp;
        
        // System.out.println(i);
        // System.out.println(j);

        // temp =i;
        // i=j;
        // j=temp;
        //     System.out.println("i is:" + i);
        //     System.out.println("j is:" + j);

        //vowels in a string 

        // String content = "samuel";
        // String vowel =" ";

        // int count =0;
        // for(int i=0; i<content.length();i++){

        //     if(content.charAt(i) == 'a' || content.charAt(i) == 'e' || content.charAt(i) == 'i' || content.charAt(i) == 'o' || content.charAt(i) == 'u'); 
        //         count++;
              
        // }

        // System.out.println(count);

        //pattern 

        // for(int i=0; i<5;i++){
        //     for(int j =0; j<i; j++){
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i =1;i<=9;i++){
        //     for(int j=1; j<=9-i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int sum=0;
        // int oddsum= 0;
        // for(int i=1; i<10;i++)
        //     {
        //         if(i%2 ==0){

        //             sum += i;
        //         }else{
        //             oddsum +=i;
        //         }
        //     }
        // System.out.println("sum is: " + sum);   
        // System.out.println("odd sum is: " + oddsum); 

        int[] arr ={9,8,7,6,5,4,3,2,1};
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

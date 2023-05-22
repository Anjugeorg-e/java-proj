package puzzle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.newList('a', 0); 
    }
    
     void newList(Character item, int pos){
    
        //    String[] Items = {"king", "coat", "five", "nail", "kite", "rose", "nose"};

        try{
         FileInputStream fis = new FileInputStream("wordlist.txt");
         InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF8"));
         
         BufferedReader br = new BufferedReader(isr);
     
         String line;
     
             line = br.readLine();
        
             String[] Items = line.split(" ");
             System.out.println(Arrays.toString(Items));
             System.out.println();
              
         System.out.println(Items.length);
         System.out.println();
     
         Set<Character>Zero = new HashSet<>();
         Set<Character>First = new HashSet<>();
         Set<Character>Second = new HashSet<>();
         Set<Character>Third  =new HashSet<>();

         Stream<String> Words = Arrays.stream(Items);

        for(int i =0; i<Items.length; i++){
            if((Items[i].charAt(pos)) == item) {
               Stream<String> arr =  Words.filter(wr -> wr.charAt(pos) == item);
             // arr.forEach(s-> System.out.println(s));
               String[] newarr = arr.toArray(String[]:: new);
             System.out.println(Arrays.toString(newarr));

             for(int k=0; k<newarr.length; k++){
                 Zero.add(newarr[k].charAt(0));
                 First.add(newarr[k].charAt(1));
                 Second.add(newarr[k].charAt(2));
                 Third.add(newarr[k].charAt(3));
            }
                  System.out.println("zeroth pos: " + Zero);
                  System.out.println("First pos: " + First);
                  System.out.println("Second pos: " + Second);
                  System.out.println("Third pos: " + Third);
         } 
         }
         
         br.close();
     }catch(Exception e){
            e.getMessage();
        } 

    }
                       
}
    

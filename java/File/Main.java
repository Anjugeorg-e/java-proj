package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
   
    public static void main(String[] args) {


  try{
    FileInputStream fis = new FileInputStream("wordlist.txt");
    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF8"));
    BufferedReader br = new BufferedReader(isr);

    String line;

    while((line = br.readLine()) != null){

        String[] elements = line.split(" ");
        System.out.println(Arrays.toString(elements));
        
        System.out.println(elements);
        System.out.println(elements.length);
        // System.out.println(elements.length());
        System.out.println(elements[0]);
    }
    br.close();

        }catch(Exception e){
                e.getStackTrace();
            }
        
        }
        

    }
    
    
    
    // try{

        //     //tryng to create a file based on th eobject
        //     boolean value = file.createNewFile();
        //     if(value){
        //         System.out.println("the new file is created ");
        //     }else{
            //         System.out.println("The file is already exists.");
            //     }
        // }catch(Exception e){
            //     e.getStackTrace();
            // }
            
            
            // char[] array = new char[100];
            // try{
                //     //creates a reader using the file reader
                //     FileReader input = new FileReader("nefile.txt");
                
                //     //reades characters
                //     input.read(array);
                //     System.out.println("Data in the file: ");
                //     //     System.out.println(array);
                
                //     //     //closes the reader
                //     //     input.close();
                //     // }catch(Exception e){
    //     //     e.getStackTrace();
    //     // }
    
    
    //     String data = "This is the data in output file";
    //     try{
        
        //         //creates a riter using filewriter
        //         FileWriter output = new FileWriter("nwefile.txt");
        
        //         //writes string to the file
        //         output.write(data);
        //         System.out.println("Data is written to the file.");
        
        //         //closes the writer
        //         output.close();
    //     }catch(Exception e){
    //         e.getStackTrace();
    //     }


    //     File file1 = new File("file.txt");

    //  //   deletes the file
    //     boolean value = file1.delete();
    //     if(value){
    //         System.out.println("The file is deleted ");
    //     }else{
        //         System.out.println("The file is not deleted. ");
        //     }

        
    // }

        // try{
        
        //     File file = new File("gtgfggfh.txt");
        //     if(file.createNewFile())
        //    {  
        //         System.out.println("File created: " + file.getName());  
        //         System.out.println("Absolute path: " + file.getAbsolutePath());  
        //       } else {  
        //         System.out.println("File already exists.");  
        //       }  
        // }catch(Exception e){
        //     e.getStackTrace();
        // }
    // //to create new file in specified path we will use  file object
    // //to read data from  the file we have to ue read() method of filereader
    // //to write data to a file we need to use write method

    // }

package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        
        byte[] array = new byte[100];

        try{

            InputStream input = new FileInputStream("test.txt");
            System.out.println("AVailable bytes in the file: " + input.available());  //writes no of bytes available in input stream

            //read byte from input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            //convert byte array to a string 
            String data = new String(array);
            System.out.println(data);

            //close input stream
            input.close();
        }catch(Exception e){
            e.getStackTrace();
        }

    }

 






    //     String data = "This is a line of text inside the file.";

    //     try{
    //         OutputStream out = new FileOutputStream("outpu.txt");

    //         //converts the string into bytes
    //         byte[] dataBYtes = data.getBytes();

    //         //write data to output stream
    //         out.write(dataBYtes);
    //         System.out.println("Data is written to the file. ");

    //         //closes the output stream
    //         out.close();
    //     }catch(Exception e){
    //         e.getStackTrace();
    //     }
    // }

    //to read  data from input stream we have implemented below 2 methods 

    // input.read(array)  -  to read data from the input stream
    // input.close()   -  to close the input stream


    //to write data to output file, we have implemnted below 2 methods

    //output.write();
    //outut.close();



    //file outputstream

    //using the ath to file

  //including the boolean parameter  - value to 
    //   FileOutputStream output = new FileOutputStream(String path, boolean value);

  //not incluidng the boolean parameter   
    //   FileOutputStream output = new FileOutputStream(String path);
}

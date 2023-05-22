package stringcomparison;

import java.util.function.Function;

public class Stringtest {
    public static void main(String[] args) {

    //     String s1 = "hello world";
    //     String s2 = "rl";

    //     Substring strTest= new Substring();
    //    System.out.println(strTest.findSubString(s1, s2));
        
    Substring strTest = new Substring("hello world");
    System.out.println(strTest.findSubString("lo"));
       
       
        // System.out.println(findMatch(s1, 0, s2));
        // System.out.println(findMatch(s1, 0, s2));
        // System.out.println(findString(s1, s2));
        // findSubstring(s1,s2);
        // System.out.println(findIndex(s1, 2, 'e'));
        // System.out.println(findIndex(s1, 0, 'a'));
        // System.out.println(findMatch(s1, s2));
        // if(findMatch(s1, s2) == true){
        //   System.out.println(findIndex(s1, 0, 'g'));
        // }

    }
}


// public static int findString(String mainString, String subStr){
    //     int mainStringLength =  mainString.length();
    //     int subStrLength = subStr.length();


    //     for(int i =0; i<mainStringLength-subStrLength+1; i++){
    //         boolean found = true;

    //         for(int j =0; j< subStrLength; j++){
    //             if(mainString.charAt(i+j) != (subStr.charAt(j))){
    //                 found =false;
    //                 
    //             }
    //         }
    
    //         }
    //         if(found){
    //             return i;
    //     }
    //     return -1;
    // }


    // public static void findMatch(String str1, String str2) {

        // int fn = findIndex(str1, 0, 'g');
        // int k = 1;
        // // String substrs1 = str1.substring(j, str2.length());
        // // System.out.println(substrs1);
    
        // while (k < str2.length()) {
    
        // if (str1.charAt(fn + 1) == str2.charAt(k)) {
    
        // System.out.println(fn);
    
        // // j=j+1;
        // // k=k+1;
        // // break;
        // }
        // else {
        // System.out.println("not found");
        // }
        // k++;
        // }

        
    // public static int findIndex(String str, int index, Character ch) {
    //     char[] chStr = str.toCharArray();
    //     int i = 0;
    //     for (i = index; i < str.length(); i++) {

    //         if (chStr[i] == ch) {
    //             return i;
    //         }
    //     }

    //     // if we reach here then we did not find the character
    //     return -1;
    // }

    // public static boolean findMatch(String str1, String str2) {

    //     boolean found = true;
    //     int fnIndex = findIndex(str1, 0, 'g');

    //     int k = 0;
    //     String substrs1 = str1.substring(fnIndex);
    //     // System.out.println(substrs1);

    //     while (k < str2.length()) {

    //         if (str2.charAt(k) == substrs1.charAt(k)) {
    //             found = true;
    //         } else {
    //             found = false;
    //         }
    //         k++;
    //     }
    //     return found;

    // }


    

    // public static boolean findMatch(String s1, int pos, String s2){

    //     int count = 0;
    //     for(int i =0;i<s2.length();i++){

    //         if(s2.charAt(i) == s1.charAt(pos+i)){

    //             count++;
    //         }
    //     }


    //     if(count == s2.length()){
    //         return true;
    //     }
    //     return false;
    // }

    // public static int searchSub(String s1, String s2){
    //     int val = -1;
    //     int i=0;

    //     int searchstrlength = s1.length();
    //     int sublength = s2.length();

    //     if(searchstrlength< sublength){
    //         return val;
    //     }
    //     if(findMatch(s1, i,s2)){
    //         return i;
    //     }
    //     return val;
    // }

    // public static boolean findMatch(String s1, int pos, String s2){
    //     int count = 0;
    //     for(int i =0;i<s2.length();i++){
    //         if(s2.charAt(i) == s1.charAt(pos+i)){
    //             count++;
    //         }
    //     }
    //     if(count == s2.length()){
    //         return true;
    //     }
    //     return false;
    // }

    // public static int searchSub(String s1, String s2){
    //     int val = -1;
    //     int i=0;

    //     int searchstrlength = s1.length();
    //     int sublength = s2.length();

    //     if(searchstrlength< sublength){
    //         return val;
    //     }
    //     if(findMatch(s1, i,s2)){
    //         return i;
    //     }
    //     return val;
    // }


   //1  // public static boolean findMatch(String s1, int pos, String s2){
        
    //     boolean found = true;
    //         for(int i=0; i<(s1.length()-s2.length())+1; i++){

    //             if(s2.charAt(pos) == s1.charAt(i)){
    //                 if(s2.charAt(pos+1) == s1.charAt(i+1)){
    //                     found = true;
    //                 }
    //             }else{
    //                 found = false;
    //             }
    //     }
      

        // // for(int i =0;i<s2.length();i++){
        //  if(s2.charAt(pos) == s1.charAt(i)){    

        //     found = true;
        // }else{
        //         found = false;
        //     }
        
        
    
        // return found;
    
    



    // public static void findMatch(int j, String str1, String str2) {

    // int k = 1;

    // while (k < str2.length()) {

    // if (str1.charAt(j + 1) == str2.charAt(k)) {
    // System.out.println(j);
    // // j=j+1;
    // // k=k+1;
    // // break;
    // }
    // else {
    // System.out.println("not found");
    // }
    // k++;
    // j = j + 1;

    // }

    

    // public static void findMatch(int j, String s1, String s2) {
    // char[] chStrs1 = s1.toCharArray();
    // char[] chStrs2 = s2.toCharArray();

    // int k = 1;
    // while (k <s2.length()) {
    // if(chStrs1[j+1] == chStrs2[k]){
    // System.out.println(j);
    // j=j+1;
    // k=k+1;
    // break;
    // }else{
    // System.out.println("not found");
    // }

    // k++;
    // }

    // if (s2.charAt(k + 1) == s1.charAt(j+1)) {
    // System.out.println(j);
    // }
    // j=j+1;
    // k++;
    // }

// }
// }

// public static void findMatch (int j,String s1, String s2){
// boolean found =true;

// while(j<s1.length()){

// if(s1.charAt(j+1) == s2.charAt(1)){

// System.out.println(j);
// break;
// }
// }

// j++;
// }
// }

// public static void findMatch(String s1, String s2){
// int k =0;
// while(k<s2.length()){

// }
// }

// String s1 = "iam anu geo ";
// String s2 ="eo";

// if(s2.length() < s1.length()){
// if(s1.contains(s2)){
// System.out.println("index: " + s1.indexOf(s2));

// }

// }

// System.out.println(s1.charAt(9));

// public static void findSubstring(String s1, String s2){

// if(s2.length() < s1.length()){
// for(int i =0; i< s1.length(); i++ )

// if(s1.charAt(i) == s2.charAt(0)){

// System.out.println(s1.indexOf(s2));

// }
// }
// }

// while(j<s1.length()){
// if(s1.charAt(j+1) == s2.charAt(1)){
// found = true;
// }else{
// found = false;
// }
// }
// System.out.println("j");
// j++;
// return found;

// public static void findMatch (int j,String s1, String s2){
// boolean found =true;

// while(j<s1.length()){

// if(s1.charAt(j+1) == s2.charAt(1)){

// System.out.println(j);
// break;
// }
// }

// j++;
// }
// }

// while(k<str2.length()){

// if( str2.charAt(k) == substrs1.charAt(fn)){
// fn=fn+1;
// found = true;

// }else{
// found = false;
// }

// k++;
// }
// return found;

// }
package stringcomparison;

public class Substring {

   public  String mainString;
    

    public  Substring(String mainString) {
        this.mainString = mainString;
    }

    public  int findSubString(String subString) {
        int k = -1;
        int mainStringLength = mainString.length(); // 4 --> hello
        int subStringLength = subString.length(); // 2 -->el

        for (int i = 0; i < mainStringLength - subStringLength + 1; i++) { // 3 comparisons
            boolean found = true;

            for (int j = 0; j < subStringLength; j++) { // j=0
                if (mainString.charAt(i + j) != (subString.charAt(j))) { // 0 != 0 found will be false again goo to next
                    found = false;
                    break;
                }
            }


            if (found == true) {

                k = i;

            }
        }
        return k;
    }

}

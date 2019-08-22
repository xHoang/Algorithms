public class Day0Reverse {
/*
* https://algodaily.com/challenges/reverse-a-string
*
*
 */
    public static void main(String args[]) {

    System.out.println(reverseString("abcd"));

    }

    public Day0Reverse(){

    }

    public static String reverseString(String str) {
        StringBuilder strBuild = new StringBuilder(str);
        String temp = "";
        for(int i = str.length() - 1; i >= 0; i--){
            temp = temp + Character.toString(strBuild.charAt(i));
        }

        return temp;
    }
}

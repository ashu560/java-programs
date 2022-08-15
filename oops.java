// import java.util.Scanner;

class oops{
    public static void main(String[] args) {
      String str = "Government College";

      for (int i = str.length()-1; i >= 0 ; i--) {
        System.out.print(str.charAt(i));
      }
        System.out.println();
      char[] chararray = str.toCharArray();
      for (int i = chararray.length - 1; i >=0 ; i--) {
        System.out.print(chararray[i]);
      }
      System.out.println();

      StringBuffer SB = new StringBuffer(str);
      System.out.println(SB.reverse());
    }
}
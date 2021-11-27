import java.util.*;
class Problem7
{
  public static void main(String args[])
  {
    String original, reverse = "";
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string to reverse: ");
    original = sc.next();

    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
    sc.close();
  }
}
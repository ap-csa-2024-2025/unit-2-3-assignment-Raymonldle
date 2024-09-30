public class Classwork
{
  public static void main(String[] args)
  {
    // test your code here
    System.out.println(DelEnd("library",1));
    System.out.println(compareLowerCase("Sterling","material"));
    System.out.println(LengthFirst("Everything in its right place"));
  }

  // write solutions to problems below
  public static String DelEnd(String text, int n){
    int stoppingPoint = text.length() - n;
    String output = text.substring(0, stoppingPoint);
    return output;
  }

  public static int compareLowerCase(String text1, String text2){
    String firstNum = text1.toLowerCase();
    String secondNum = text2.toLowerCase();
    
    return firstNum.compareTo(secondNum);
  }

  public static int LengthFirst(String sentence){
    int index = sentence.indexOf(" ");
    return index;
  }

}

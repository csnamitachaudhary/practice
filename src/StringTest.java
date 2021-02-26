public class StringTest {

  public static void main(String[] args) {
    String str1 = "abcd";
    String str2 = "aabcd";
    System.out.println(str1.length());
    System.out.println(str1.charAt(2));
    System.out.println(str1.toUpperCase());
    System.out.println(str1.toLowerCase());
    System.out.println(str1.substring(2));
    System.out.println(str1.substring(2).concat("fg"));
    System.out.println(str1.substring(2, 4));
    System.out.println(str1.compareTo(str2));
    String[] arrs = str1.split("b");
    for (String s : arrs) {
      System.out.println(s);
    }
    System.out.println(String.join("b", arrs));
    String begin = str1.substring(0, 1);
    String beginUp = begin.toUpperCase();
    String last = str1.substring(1);
    String f = beginUp + last;
    System.out.println(f);
  }


}

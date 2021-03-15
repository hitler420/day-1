
class StudentAbstract {
  static void m1(String s1) {
    s1 = s1.toUpperCase(); System.out.print(s1);
  }
  static void m2(String s1) {
    s1.toLowerCase(); System.out.print(s1);
  }
  public static void main(String[] s) {
    String s1 = "Ab";
    m1(s1); m2(s1);
    System.out.print(s1);
}}
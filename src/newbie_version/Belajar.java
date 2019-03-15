package newbie_version;

import java.io.PrintStream;







public class Belajar
{
  int n;
  
  public Belajar() {}
  
  public static void main(String[] args)
  {
    number(1);
  }
  
  public static void number(int x)
  {
    Count(x);
  }
  
  public static void Count(int n) {
    if (n <= 100) {
      System.out.println(n);
      n++;
      number(n);
    }
  }
}

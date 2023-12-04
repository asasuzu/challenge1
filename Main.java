public class Main{
  public static void main(String[] args) {
    int i = 1;
    while (true) {
      if(i < 1000) {
        break;
      }
      i = i * 2;
    }  
    System.out.println(i);
  }
}
public class Exercise1 {
  public static void main(String[] args) {
    System.out.println("cs(20): " + cs(20));
    System.out.println("cs(5): " + cs(5));
    System.out.println("cs(-2): " + cs(-2));
    System.out.println("cs(100): " + cs(100));
  }
  
  static int cs(int n){
    if (0 <= n && n < 10) {
      return n;
    }
    
    return n % 10 + cs(n/10);
  }
}

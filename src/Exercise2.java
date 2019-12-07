public class Exercise2 {
  public static void main(String[] args) {
    System.out.println(secToString(121));
    System.out.println(secToString(86399));
  }
  
  static String secToString(int k) {
    if (k >= 86400 || k < 0) {
      return "xx:xx:xx";
    }
    
    k = k % (24 * 3600);
    int hour = k / 3600;
    
    k %= 3600;
    int minutes = k /60;
    
    k %= 60;
    int seconds = k;
    
    return hour + ":" + minutes + ":" + seconds;
  }
}

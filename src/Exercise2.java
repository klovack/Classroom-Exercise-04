public class Exercise2 {
  public static void main(String[] args) {
    System.out.println(secToString(121));
    System.out.println(secToString(86399));
    System.out.println(secToString(86500));
  }
  
  static String secToString(int k) {
    if (k >= 86400 || k < 0) {
      return "xx:xx:xx";
    }
    
    // Merubah detik menjadi jam
    k = k % (24 * 3600);
    int hour = k / 3600;
    
    // Merubah sisa detik menjadi menit
    k %= 3600;
    int minutes = k /60;
    
    // Merubah sisa menit menjadi detik
    k %= 60;
    int seconds = k;
    
    return hour + ":" + minutes + ":" + seconds;
  }
}

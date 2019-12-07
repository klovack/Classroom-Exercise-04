public class Exercise3 {
  public static void main(String[] args) {
    System.out.println(contentsLine("Chapter 5", "123"));
    System.out.println(contentsLine("Chapter 6: That has exact", "27"));
    System.out.println(contentsLine("Chapter 7", "This is more than 27 characters"));
    System.out.println(contentsLine("Chapter 7", "This is more than 27 characters", true));
  }
  
  static String contentsLine(String s, String t) {
    return contentsLine(s, t, false);
  }
  
  
  static String contentsLine(String s, String t, boolean forcePrint) {
    int totalLength = s.length() + t.length();
    int maxLength = 30;
    
    if (totalLength > 27) {
      if (!forcePrint) {
        return null;
      }
    }
    
    int numOfDots = maxLength - totalLength;
    StringBuilder sb = new StringBuilder();
    sb.append(s);
//    String returnString = s;
    
    for (int i = 0; i < numOfDots ; i++) {
      sb.append('.');
      
//      returnString = returnString + ".";
    }
    
//    returnString = returnString + t;
    sb.append(t);
    
    return sb.toString();
  }
}

public class Exercise5 {
  public static void main(String[] args) {
    int[] heiligAbend = decomposeDate("24.12.2019");
    int[] silvester = decomposeDate("31.12.2017");
    int[] neuJahr = decomposeDate("01.01.2018");
  
    System.out.print("Heiligabend: ");
    printDateArray(heiligAbend);
    
    System.out.print("Silvester: ");
    printDateArray(silvester);
    
    System.out.print("Neu Jahr: ");
    printDateArray(neuJahr);
  }
  
  static void printDateArray(int[] array) {
    for (int i = 0; i < array.length ; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
  
  static int[] decomposeDate(String s) {
    String[] splittedDateString = s.split("[.]");
    
    if (splittedDateString.length != 3) {
      return null;
    }
    
    int day = Integer.parseInt(splittedDateString[0]);
    int month = Integer.parseInt(splittedDateString[1]);
    int year = Integer.parseInt(splittedDateString[2]);
    
    return new int[] {day, month, year};
  }
}

import java.util.Random;

public class Exercise4 {
  public static void main(String[] args) {
    int[][] x = myMakeArray(20);
    int[][] y = myMakeArray(10);
    int[][] z = myMakeArray(2);
    
    print2DArray(x);
    print2DArray(y);
    print2DArray(z);
  }
  
  static int [][] myMakeArray(int k) {
    int [][] returnArray = new int[k + 1][];
    Random random = new Random();
    
    for (int i = 0; i < returnArray.length; i++) {
      returnArray[i] = new int[i];
      for (int j = 0; j < i ; j++) {
        returnArray[i][j] = random.nextInt();
      }
    }
    
    return returnArray;
  }
  
  static void print2DArray(int[][] array) {
    for (int i = 0; i < array.length ; i++) {
      if (i == array.length - 1) {
        System.out.print(array[i].length);
      } else {
        System.out.print(array[i].length + ", ");
      }
    }
  
    System.out.println();
  }
}

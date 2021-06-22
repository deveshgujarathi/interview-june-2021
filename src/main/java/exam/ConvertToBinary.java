package exam;
import java.util.*;

public class ConvertToBinary {

  public void toBinary(int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int b[] = new int[40];
     int index = 0;
     while(n > 0){
       b[index++] = n%2;
       n = n/2;
     }
     for(int i = index-1;i >= 0;i--){
       System.out.print(b[i]);
     }
}
  public static void main(String a[]){
    ConvertToBinary obj = new ConvertToBinary();
    obj.toBinary(35);
  }
}

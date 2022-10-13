import java.util.Arrays;

import static java.util.Arrays.*;

public class FindSecondLargestNuminArray {
    public static void main(String[] args) {
        int[] a={12,32,54,23,35,22};
        int size=a.length;
        SecondLArgest(a);
        System.out.println(a[size-2]);

    }
    public static void SecondLArgest(int a[]){
      Arrays.sort(a);


    }
}

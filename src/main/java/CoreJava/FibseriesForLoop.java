import java.util.Scanner;

public class FibseriesForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int temp =0;
        for(int count=2;count<=num;count++)
        {
          temp=b;
             b=a+b;
            a=temp;

        }
        System.out.println(b);
    }
}

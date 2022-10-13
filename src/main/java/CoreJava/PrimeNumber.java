import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
      primeNum();
//        try{
//            int a = 1/0;
//        }
//        catch(Exception e){
//            System.out.println("hello");
//        }

    }

    static void primeNum(){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
    for(int i=2;i<=num-1;i++) {
        if (num % i == 0) {
            temp = temp + 1;
        }
    }
    if(temp!=0)
        {
            System.out.println(num + ""+"not prime");

    }
        else
            System.out.println("prime");


    }
}

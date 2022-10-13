import java.util.Scanner;

public class Calculator {

    public int add(int x,int y){
        int z= x+y;
        return z;

    }
    public int sub(int x,int y){
        int z= x-y;
        return z;

    }
    public int mul(int x,int y){
        int z= x*y;
        return z;

    }
    public int div(int x,int y) {
        int z = 0;
        if (y != 0) {
            z = x / y;
        }

        return z;
    }
    public static void main(String[] args) {

        Calculator c= new Calculator();

        System.out.println(c.add(2,3));
        System.out.println(c.sub(3,4));
        System.out.println(c.mul(4,5));
        System.out.println(c.div(20,5));


        int num= (int) (Math.random()*10);
        if(num>4)
        {System.out.println("greater than 4");
        }
        else
            System.out.println("not greater than 4");

 //for loop for printing numbers using user input
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println(i);
//
//        }

    //while loop for printin number from 1 to 10
    int numWhile=1;
        while(numWhile<=10)

        {
            System.out.println(numWhile);
            numWhile++;
        }

    // do while loop example for printing number till 10
        int x=100;
        do{
            System.out.println(x);
            x=x+1;
    }
        while(x<=10);
 //find maximum number of three numbers


        int a=100;
         int b=200;
         int d=30;


         if (a>b) {
             System.out.println("max is"+""+ a);
         }
         else if(b>d){
             System.out.println("max is "+b);
         }
         else{
             System.out.println("max is "+d);
         }

//using math.max method
        int max=Math.max(d,Math.max(a,b));
        System.out.println("max num of a,b,d is "+ ""+max);

        // how to check if alphabet is lower case or upper case
        Scanner ch= new Scanner(System.in);
      char alphabet=  ch.next().trim().charAt(0);
      if(alphabet>='a' && alphabet<='z'){
          System.out.println("aplhabet is lowercase");
      }
      else
          System.out.println("alphabet is upper casae");

}}

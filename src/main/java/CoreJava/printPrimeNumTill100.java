public class printPrimeNumTill100 {
    public static void main(String[] args) {
        int n1=1;
        int n2=100;
        int i, j;
        //using nested for loops
        for(i=n1;i<=n2;i++)
        {
            for( j=2;j<=i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(j);
        }
    }
}

import java.util.Scanner;

public class Fibonacci {
    public static void main(String ags[])
    {
        Fibonacci fb=new Fibonacci();
        Scanner S=new Scanner(System.in);
        System.out.println("1.N no of terms\n2.Nth term");
        char c='y';
        while(c=='y')
        {
            System.out.println("Enter your choice: ");
            int ch=S.nextInt();
            switch(ch)
            {
                case 1:fb.NTerms();break;
                case 2:fb.Nthterm();break;
                default :break;
            }
            System.out.println("You want to continue or not(y/n)");
            c=S.next().charAt(0);
        }
        //Closing scanner class
        S.close();
    }
    public void NTerms()
    {
        Scanner S=new Scanner(System.in);
        int a=0,b=1;
        int c=0;
        System.out.println("Enter number of terms: ");
        int n=S.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        System.out.print("\n");
        //Closing scanner class
        S.close();
    }
    public void Nthterm()
    {
        Scanner S=new Scanner(System.in);
        int a=0,b=1;
        int c=0;
        System.out.println("Enter Nth term: ");
        int n=S.nextInt();
        for(int i=0;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
        //Closing scanner class
        S.close();
    }
}
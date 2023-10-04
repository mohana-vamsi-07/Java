import java.util.Scanner;
public class Prime {
    public static void main(String ags[])
    {
        Prime p=new Prime();
        Scanner S=new Scanner(System.in);
        System.out.println("1.Prime or Not\n2.Nth prime\n3.Upto N primes");
        char c='y';
        while(c=='y')
        {
            System.out.println("Enter your choice: ");
            int ch=S.nextInt();
            switch(ch)
            {
                case 1:p.PrimeOrNot();break;
                case 2:p.NPrime();break;
                default :break;
            }
            System.out.println("You want to continue or not(y/n)");
            c=S.next().charAt(0);
        }
        //Closing scanner class
        S.close();
    }
    public void PrimeOrNot()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=S.nextInt();
        boolean flag=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            flag=false;
        }
        if(flag==true)
        System.out.println("Prime number!");
        else
        System.out.println("Not a prime number!");
        //Closing scanner class
        //S.close();
        //Closing scanner class here throws an exception as the c variable will be read after this method.
        //To resolve this and to close the scanner class create a new class and inherit that class with Prime class.
    }
    public void NPrime()
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        System.out.println(n);
        //Closing scanner class
        //S.close();
        //Closing scanner class here throws an exception as the c variable will be read after this method.
        //To resolve this and to close the scanner class create a new class and inherit that class with Prime class.
    }
}
/*
 * if(ch==1)
        {
            System.out.println("Enter the String:");
            String st=S.next();
            st.toLowerCase();
            String newst="";
            for (int i=0; i<st.length(); i++)
            {
                char c= st.charAt(i); //extracts each character
                newst= c+newst; //adds each character in front of the existing string
            }
            if(st==newst)
            System.out.println("Pri");
            else
            System.out.println("No");
        }
 */
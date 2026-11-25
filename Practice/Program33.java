import java.util.Scanner;

class Program33 
{
    public static void Maximum(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println("Maximum is: " + iNo1);
        }

        else
        {
            System.out.println("Maximum is: " + iNo2);
        }
    }
    public static void main(String A[]) 
    { 
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

       Maximum(iValue1, iValue2);

    }
    
}

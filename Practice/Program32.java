import java.util.Scanner;

class Program32 
{
    public static void main(String A[]) 
    { 
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        if(iValue1 > iValue2)
        {
            System.out.println("Maximum is: " + iValue1);
        }

        else
        {
            System.out.println("Maximum is: " + iValue2);
        }

    }
    
}

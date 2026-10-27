import java.util.Scanner;

class Program11 
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = scanner.nextInt();

        if((iValue % 2) == 0)
        {
            System.out.println("It is even number");
        }

        else
        {
            System.out.println("It is odd number");
        }

    }
    
}

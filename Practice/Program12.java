import java.util.Scanner;

class Program12
{
    static void CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
            {
                System.out.println("It is even number");
            }

            else
            {
                System.out.println("It is odd number");
            }
    }
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = scanner.nextInt();

       CheckEven(iValue);

    }
    
}

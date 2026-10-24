import java.util.Scanner;

class Program5
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iResult = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        iResult = iValue1 + iValue2;

        System.out.println("Addition is: " + iResult);  
    }
    
}

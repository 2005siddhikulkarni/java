import java.util.Scanner;

class Program6
{
    static void Addition(int iNo1, int iNo2)
    {
        int iAns = 0;

        iAns = iNo1 + iNo2;

       System.out.println("Addition is: " + iAns);  
    }

    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        Addition(iValue1, iValue2);
    }
    
}

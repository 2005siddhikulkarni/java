import java.util.Scanner;

class Program42 
{
    static int Minimum(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 < iNo2) && (iNo1 < iNo3))
        {
            return iNo1;
        }

        else if((iNo2 < iNo1) && (iNo2 < iNo3))
        {
            return iNo2;
        }

        else
        {
            return iNo3;
        }
    }
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iValue3 = 0, iResult = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        iValue3 = scanner.nextInt();

        iResult = Minimum(iValue1, iValue2, iValue3);
        System.out.println("Minimum is: " + iResult);
        
    }
    
}

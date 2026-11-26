import java.util.Scanner;

class Max
{
    public static int Maximum(int iNo1, int iNo2)
    {
        int iMax = 0;

        if(iNo1 > iNo2)
        {
            iMax = iNo1;
        }

        else
        {
            iMax = iNo2;
        }

        return iMax;
    }
}

class Program34
{
    public static void main(String A[]) 
    { 
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iResult = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        iResult = Max.Maximum(iValue1, iValue2);
        System.out.println("Maximum is: " + iResult);

    }
    
}

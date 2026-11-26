import java.util.Scanner;

class Max
{
    public int Maximum(int iNo1, int iNo2)
    {

        if(iNo1 > iNo2)
        {
            return iNo1;
        }

        else
        {
            return iNo2;
        }

    }
}

class Program35
{
    public static void main(String A[]) 
    { 
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iResult = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        Max max = new Max();

        iResult = max.Maximum(iValue1, iValue2);
        System.out.println("Maximum is: " + iResult);

    }
    
}

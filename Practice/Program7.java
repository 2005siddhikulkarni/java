import java.util.Scanner;

class Program7
{
    int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;

        iAns = iNo1 + iNo2;

        return iAns;
    }

    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        Program7 pobj = new Program7();

        int iValue1 = 0, iValue2 = 0, iResult = 0;

        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        iResult = pobj.Addition(iValue1, iValue2);

        System.out.println("Addition is: " + iResult);  
    }
    
}

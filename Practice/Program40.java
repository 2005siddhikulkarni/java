import java.util.Scanner;

class Max
{
    public  int Maximum(int iNo1, int iNo2, int iNo3)
    {
        if((iNo1 > iNo2) && (iNo1 > iNo3))
        {
            return iNo1;
        }

        else if((iNo2 > iNo2) && (iNo2 > iNo3))
        {
            return iNo2;
        }

        else
        {
            return iNo3;
        }
    }

}

class Program40
{
        public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        int iResult = 0;
        
        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        iValue3 = scanner.nextInt();

        Max max = null;
        max = new Max();

        iResult = max.Maximum(iValue1, iValue2, iValue3);
        System.out.println("Maximum is: " + iResult);
        
    }
    
}

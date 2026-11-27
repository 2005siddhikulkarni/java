import java.util.Scanner;

class Avg
{
    public static float Average(int iNo1, int iNo2)
    {
        float fAns = 0.0f;

        fAns = ((float)iNo1 + (float)iNo2) / 2;

        return fAns;
    }

}

class Program38
{
        public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
        float fResult = 0.0f;
        
        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        fResult = Avg.Average(iValue1, iValue2);
        System.out.println("Average is: " + fResult);
        
    }
    
}

import java.util.Scanner;

class Avg
{
    public  float Average(int iNo1, int iNo2, int iNo3)
    {
        float fAns = 0.0f;

        fAns = ((float)iNo1 + (float)iNo2 + (float)iNo3) / 3;

        return fAns;
    }

}

class Program39
{
        public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        float fResult = 0.0f;
        
        System.out.println("Enter the first number: ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iValue2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        iValue3 = scanner.nextInt();

        Avg avg = null;
        avg = new Avg();

        fResult = avg.Average(iValue1, iValue2, iValue3);
        System.out.println("Average is: " + fResult);
        
    }
    
}

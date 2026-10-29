import java.util.Scanner;

class Demo
{
    static boolean CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
            {
                return true;
            }

            else
            {
               return false;
            }
    }

}

class Program17
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iValue = scanner.nextInt();

       bRet = Demo.CheckEven(iValue);

       if(bRet == true)
       {
            System.out.println("It is even number");
       }

       else
       {
            System.out.println("It is odd number");
       }

    }
    
}

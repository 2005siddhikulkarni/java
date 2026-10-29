import java.util.Scanner;

class Program19
{
    boolean CheckEven(int iNo)
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
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);
        Program18 program18 = new Program18();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iValue = scanner.nextInt();

       bRet = program18.CheckEven(iValue);

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

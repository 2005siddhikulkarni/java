import java.util.Scanner;

class Demo
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

}

class Program15
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        Demo demo = new Demo();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iValue = scanner.nextInt();

       bRet = demo.CheckEven(iValue);

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

import java.util.Scanner;

class Demo
{
    void CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
            {
                System.out.println("It is even number");
            }

            else
            {
                System.out.println("It is odd number");
            }
    }

}

class Program14
{
    public static void main(String A[]) 
    {
        Scanner scanner = new Scanner(System.in);

        Demo demo = new Demo();

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = scanner.nextInt();

       demo.CheckEven(iValue);

    }
    
}

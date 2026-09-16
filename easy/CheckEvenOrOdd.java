import java.util.Scanner;
class CheckEvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;
        String oddOrEven;

        System.out.print("Enter a number : ");
        num = in.nextInt();

        if(num % 2 == 0 )
        {
            oddOrEven = "Even Number";
        }
        else
        {
            oddOrEven = "Odd Number";
        }

        System.out.println("The Entered Number " + num + " is " + oddOrEven);
    }
}
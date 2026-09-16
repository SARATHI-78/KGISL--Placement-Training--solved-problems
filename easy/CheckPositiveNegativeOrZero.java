import java.util.Scanner;
class CheckPositiveNegativeOrZero
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;
        String result;

        System.out.print("Enter a number : ");
        num = in.nextInt();

        if(num == 0 )
        {
            result = "Zero";
        }
        else if(num > 0)
        {
            result = "Positive Number";
        }
        else{
            result = "Negative Number";
        }

        System.out.println("The Entered Number " + num + " is " + result);
    }
}
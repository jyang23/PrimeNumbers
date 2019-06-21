import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Last Number in the Range");
        int input = in.nextInt();

        for(int i = 1; i<=input; i++)
        {
            if(i == 1)
            {
                System.out.println(i+" is not prime number");
            }
            else if(i == 2 || i == 3)
            {
                System.out.println(i+" is a prime number");
            }
            else if(!(i%2==0) && !(i%3==0))
            {
                System.out.println(i+" is a prime number");
            }
            else
            {
                System.out.println(i+" is not prime number");
            }
        }
    }
}

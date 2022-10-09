import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scanner.nextInt();
      //  n%2==0 ? " Even number " : " Odd number " ;
        if (n % 2 == 0) {
            System.out.println(" The number " + n + "is even");

        } else {
            System.out.println(" The number " + n + " is odd ");
        }
        }
    }
import java.util.Scanner;
public class sc 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number:");
        int a = sc.nextInt();
        System.out.println("Second Number:");
        int b = sc.nextInt();
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Add:" + (a + b));
                break;
            case 2:
                System.out.println("Subtract:" + (a - b));
                break;
            case 3:
                System.out.println("Multiply:" + (a * b));
                break;
            case 4:
                System.out.println("Divide:" + (a / b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}



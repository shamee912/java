import java.util.Scanner;
public class switchscanner
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice)
        {
          case 1:
               System.out.println("cold coffee");
               break;
            case 2:
                System.out.println("cappucino");
                break;
            case 3:
                System.out.println("black coffee");
                break;
            case 4:
                System.out.println("lattee");
                break;  
            case 5:
                System.out.println("mocha");
                break; 
            default:
                 System.out.println("not a correct choice");  
        }
    }
}
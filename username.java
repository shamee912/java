import java.util.Scanner;
public class username
{
    public static void main(String[] args)
    {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter your username:");
        String username=myobj.next();
        System.out.println("The username is:"+username);
    }
}
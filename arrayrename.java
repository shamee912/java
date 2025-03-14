public class arrayrename
{
     public static void main(String[] args)
{
    String[] fruits={"apple","orange","banana","guava","strawberry"};
    fruits[0]="pineapple";
    for(int i=0;i<fruits.length;i++)
    System.out.println(fruits[i]);
}
}
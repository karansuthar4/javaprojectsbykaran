import java.util.Scanner;
public class inputtaking {
    public static void main(String[] args){
    System.out.println("taking input from the user:");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no 1:");
    int a=sc.nextInt();
    System.out.println("enter no 2:");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("the sum of 2 no:");
    System.out.println(sum);
   }
}

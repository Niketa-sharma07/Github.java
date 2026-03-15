import java.util.Scanner;
public class Largestnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a first number:");
        int a = sc.nextInt();
        System.out.print("enter a 2nd number:");
        int b = sc.nextInt();
        System.out.print("enter a 3rd number:");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is the largest number");
        }
        else if(b>a && b>c){
            System.out.println("b is the largest number");
        }
        else{
            System.out.println("c is the largest numbber");
        }
    }
}
import java.util.Scanner;
public class DivisibleNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        if(n%2==0  && n%3==0 && n%5!=0 ){
            System.out.print("the number is divisible by 2 and 3 but not divisible by 5");
        }
        else if(n%5==0){
            System.out.print("the number is divisible by 5");
        }
        else{
            System.out.print("condition is not satisfied");
        }

    }
    
}

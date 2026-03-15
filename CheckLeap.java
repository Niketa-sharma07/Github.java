import java.util.Scanner;
public class CheckLeap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  year:");
        int n = sc.nextInt();
        if(n%4==0 && n%100!=0 ){
            System.out.print("it's leap year");

        }
        else if(n%400==0){
            System.out.print("it's  leap year");
        }
        else{
            System.out.print("it's not leap year");
        }
        


    }
    
}

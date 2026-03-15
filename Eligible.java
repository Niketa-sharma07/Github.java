import java.util.Scanner;
public class Eligible {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("the person eligible for vote:");
        }
        else{
            System.out.print("the person is not eligible for vote");
        }


    }
    
}

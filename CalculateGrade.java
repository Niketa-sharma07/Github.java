import java.util.Scanner;
public class CalculateGrade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a student marks:");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.print("Grade A");
        }
        else if(marks>=75){
            System.out.print("Grade B");
        }
        else if(marks>=50){
            System.out.print("Grade C");
        }
        else{
            System.out.print("Fail");
        }

    }
    
}

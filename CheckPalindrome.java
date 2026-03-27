import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a element:");
        String str = sc.nextLine().trim();
        if(check(str))
            System.out.print("string is palindrome");
    
        
        else
            System.out.print("string is not palindrome");
        


    }
    public static boolean check(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        return check(str.substring(1,str.length()-1));
    }
    
}

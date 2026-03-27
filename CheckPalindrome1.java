public class CheckPalindrome1 {
    public static void main(String[] args){
        String str="madami";
        if(check( str,0 ,str.length()-1)){
            System.out.print("string is palindrome");

        }
        else{
            System.out.print("string is not palindrome");
        }

    }
    public static boolean check(String str,int start ,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return check(str,start+1, end-1);
    }
    
}

public class FindSubset {
    public static void subset(String str ,int i, String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");


            }
            else{
                System.out.println(ans);
                return;
            }
        }
        subset(str,i+1,ans+str.charAt(i));
        subset(str,i+1,ans);

    }
    public static void main(String args[]){
        String str = "123";
        subset(str,0," ");


    }
    
}

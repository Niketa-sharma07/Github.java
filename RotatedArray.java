public class RotatedArray {
    public static int searchArray(int arr[],int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;

        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return searchArray(arr,target,si,mid-1);
            }
            else{
                return searchArray(arr,target,mid+1,ei);
            }

        }
        else{
            if(arr[mid]<=target && target<=ei){
                return searchArray(arr,target,mid+1,ei);
            }
            else{
                return searchArray(arr,target,si,mid-1);
            }
        }


    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target=0;
        
       int idx = searchArray(arr,target,0,arr.length-1);
       System.out.print("find the idx of target:"+idx);

    }
    
}

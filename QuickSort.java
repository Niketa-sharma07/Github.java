public class QuickSort {
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void quickSortt(int nums[] ,int si ,int ei){
        if(ei<=si){
            return;
        }
        int pidx = partion(nums,si,ei);
        quickSortt(nums , si,pidx-1);
        quickSortt(nums,pidx+1,ei);

    }
    public static int partion(int nums[],int si, int ei){
        int pivot = nums[ei];
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(nums[j]<= pivot){
                i++;
                // swap
                int temp = nums[j];
                nums[j] = nums[i]; 
                nums[i] = temp;         
        }
    }
    i++;
    // swap
    int temp = pivot;
    nums[ei] = nums[i];
    nums[i] = temp;
    return i;
    
}
    public static void main(String args[]){
        
        int nums[] = {6,3,9,8,2,5};
        quickSortt(nums ,0,nums.length-1);
        printarr(nums);
    }
    
}

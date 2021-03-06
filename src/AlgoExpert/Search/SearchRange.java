package AlgoExpert.Search;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchForRange(new int[]{0,1,21,33,45,45,45,45,45,45,61,71,73}, 45)));
    }
    public static int[] searchForRange(int[] array, int target) {
        // Write your code here.
        int[] finalRange= {-1,-1};
        alteredBinarySearch(array, target, 0, array.length -1, finalRange, true);
        alteredBinarySearch(array, target, 0, array.length -1, finalRange, false);
        return finalRange;
    }
    public static void alteredBinarySearch(int[] array, int target, int left, int right, int[] finalRange, boolean goLeft){

        if(left > right){
            return;
        }
        int mid = (left + right)/2;
        if(array[mid] < target){
            alteredBinarySearch(array, target, mid+1, right, finalRange, goLeft);
        }
        else if(array[mid] > target){
            alteredBinarySearch(array, target, left, mid-1, finalRange, goLeft);
        }
        else{
            if(goLeft){
                //target at begin
                if(mid ==0 || array[mid-1] != target ){
                    finalRange[0] = mid;
                }
                else{
                    alteredBinarySearch(array, target, left, mid-1, finalRange, goLeft);
                }
            }
            else{
                if(mid == array.length-1 || array[mid+1] != target ){
                    finalRange[1] = mid;
                }
                else{
                    alteredBinarySearch(array, target, mid+1, right, finalRange, goLeft);
                }
            }
        }

    }
}

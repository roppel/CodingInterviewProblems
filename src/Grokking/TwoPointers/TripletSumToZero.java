package Grokking.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {
    public static void main(String[] args) {
        System.out.println(TripletSumToZero.searchTriplets(new int[] { -3, 0, 1, 2, -1, 1, -2 }));
        System.out.println(TripletSumToZero.searchTriplets(new int[] { -5, 2, -1, -2, 3 }));
    }

    public static List<List<Integer>> searchTriplets(int[] arr) {

        List<List<Integer>> triplets = new ArrayList<>();
        // TODO: Write your code here

        Arrays.sort(arr);
// -3, -2, -1, 0, 1, 1, 2


        for (int i = 0; i < arr.length-2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) // skip same element to avoid duplicate triplets
                continue;

            searchPair(arr, triplets, -arr[i], i+1);
        }




        return triplets;
    }

    private static void searchPair(int[] arr, List<List<Integer>> triplets, int target, int left) {
        int right = arr.length-1;

        while(left < right){
            int sum =  arr[left] + arr[right];

            if (sum == target) {
                triplets.add(Arrays.asList(-target, arr[left],arr[right]));
                left++;
                right--;

                while(left< right && arr[left] ==arr[left -1]){
                    left++;
                }
                while(left< right && arr[right] ==arr[right +1]){
                    right++;
                }
            }
            else if (sum < target){
                left++;
            }
            else{
                right--;
            }



        }
    }
}

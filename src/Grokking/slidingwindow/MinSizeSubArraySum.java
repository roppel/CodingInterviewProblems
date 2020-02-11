package Grokking.slidingwindow;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int result;
         result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
        System.out.println("Smallest subarray length: " + result);
         result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
        System.out.println("Smallest subarray length: " + result);
        result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
        System.out.println("Smallest subarray length: " + result);
    }
    public static int findMinSubArray(int S, int[] arr) {

        int max = 0;
        int windowStart =0;
        int minLength = Integer.MAX_VALUE;
        int sum =0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {

            sum +=arr[windowEnd];

            while(sum >= S){
                minLength =Math.min(minLength, windowEnd-windowStart+1);


                sum-=arr[windowStart];
                windowStart++;


            }

        }


        return minLength;
    }
}

class Solution {

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length,sum=0;
        int first,last;
        int target,odd;
        for (int i = 0; i < n; i++) {
             first = n - i;
             last = i + 1;
             target = first * last;
             odd = target / 2;
            if (target % 2 == 1) odd++;
            sum += odd * arr[i];
        }
        return sum;
    }
}

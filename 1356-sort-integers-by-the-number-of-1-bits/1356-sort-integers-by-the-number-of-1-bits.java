class Solution {

    public int[] sortByBits(int[] arr) {
        Pair<Integer, Integer>[] pairs = new Pair[arr.length];

        for (int a = 0; a < arr.length; a++) {
            int count = helper(arr[a]);
            pairs[a] = new Pair<>(arr[a], count);
        }

        for (int a = 0; a < arr.length; a++) {
            System.out.println(pairs[a].getKey() + " " + pairs[a].getValue());
        }
        int[] res = new int[arr.length];
        int count=0;

        for (int i = 0; i < pairs.length - 1; i++) {
            for (int j = 0; j < pairs.length - i - 1; j++) {
                if (pairs[j].getValue() > pairs[j+1].getValue()) {
                    Pair<Integer, Integer> temp = pairs[j];
                    pairs[j] = pairs[j+1];
                    pairs[j+1] = temp;
                }else if(pairs[j].getValue() == pairs[j+1].getValue() &&  pairs[j].getKey() > pairs[j+1].getKey() )
                {
                   Pair <Integer, Integer> temp = pairs[j];
                    pairs[j] = pairs[j+1];
                    pairs[j+1] = temp;
                }
            }
        }
         System.out.println("second loop ");
        for (int a = 0; a < arr.length; a++) {
            res[a]=pairs[a].getKey();
             System.out.println(pairs[a].getKey() + " " + pairs[a].getValue());
        }
        return res;
    }

    public static int helper(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>>= 1;
        }
        return count;
    }
}

class Solution {
    public void sort012(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        // add 0s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                res.add(0);
            }
        }

        // add 1s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                res.add(1);
            }
        }

        // add 2s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                res.add(2);
            }
        }

        // copy back to array
        for (int i = 0; i < n; i++) {
            arr[i] = res.get(i);
        }
    }
}

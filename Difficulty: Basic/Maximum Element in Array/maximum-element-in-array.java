
class Solution {
    public static int largest(int[] arr) {
        // code here
        int res=Arrays.stream(arr).max().getAsInt();
        return res;
    }
}

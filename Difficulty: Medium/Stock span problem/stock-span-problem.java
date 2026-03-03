import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            
            // Pop elements smaller than or equal to current price
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty, span is i+1
            if (st.isEmpty()) {
                span.add(i + 1);
            } 
            // Else span is difference between current index and top index
            else {
                span.add(i - st.peek());
            }

            // Push current index to stack
            st.push(i);
        }

        return span;   // ✅ Correct return
    }
}
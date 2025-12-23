class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l < r){
            int mid = (l + r) / 2;
            
            // Recursively sort left and right halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            
            // Merge the sorted halves
            int n1 = mid - l + 1;
            int n2 = r - mid;
            
            int[] L = new int[n1];
            int[] R = new int[n2];
            
            for(int i = 0; i < n1; i++){
                L[i] = arr[l + i];
            }
            
            for(int j = 0; j < n2; j++){
                R[j] = arr[mid + 1 + j];
            }
            
            int i = 0, j = 0;
            int k = l;
            
            while(i < n1 && j < n2){
                if(L[i] <= R[j]){
                    arr[k] = L[i];
                    i++;
                }else{
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            
            while(i < n1){
                arr[k] = L[i];
                i++;
                k++;
            }
            
            while(j < n2){
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
}
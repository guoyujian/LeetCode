class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k >= arr.length) {
            return arr;
        }
        return quickSort(arr, k, 0, arr.length - 1);
    }

    private int[] quickSort(int[] arr, int k, int l, int r) {
        int i = l, j = r;
        while(i<j) {
//            while(i<j && arr[i] <= arr[l])  i++;
//            while(i<j && arr[j] >= arr[l])  j--;
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++; //这两行while的顺序必须是如此，为什么？

            swap(arr, i, j);
        }
        swap(arr, i, l);
        if(i<k) return quickSort(arr, k, i+1, r);
        if(i>k) return quickSort(arr, k, l, i-1);
        return Arrays.copyOf(arr, k);
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
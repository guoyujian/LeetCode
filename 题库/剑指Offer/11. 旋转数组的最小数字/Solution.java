class Solution {
    //二分法
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while(low < high) {
            int pivot = low + (high - low) / 2;
            if(numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else if(numbers[pivot] < numbers[high]) {
                high = pivot;
            } else {
                high --;
            }
        }
        return numbers[low];
    }
}
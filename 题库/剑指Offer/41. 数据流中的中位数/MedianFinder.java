class MedianFinder {
    ArrayList<Integer> list;
    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        int i = 0, j = list.size() - 1;
        while(i <= j) {
            int mid = (i + j) / 2;
            if(list.get(mid) <= num) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        list.add(i, num);
    }

    public double findMedian() {
        if(list.size() % 2 == 1) {
            //奇数
            return new Double(list.get(list.size() / 2));
        } else {
            return (double)(list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
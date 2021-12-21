class RandomizedSet {

    private Map<Integer, Integer> map; //key存放待插入的值，val存放key在list中的索引（位置）
    private List<Integer> list;
    /**
     * Initialize yur data structure here.
     */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    /**
     * Inserts a value to the set.
     * Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /**
     * Removes a value from the set.
     * Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        //要让删除的时间复杂度为常数，则需要先将待删除的元素和最后一个元素互换，然后删除最后一个元素。
        if(!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val); //获取被删除元素在list中的索引值
        int lastVal = list.get(list.size()-1); //最后一个元素的值
        list.set(index, lastVal);
        list.remove(list.size()-1);
        map.put(lastVal, index);
        map.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
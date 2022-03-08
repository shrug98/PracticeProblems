class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elemCountMap = new HashMap<>();
        for(int num : nums) {
            elemCountMap.put(num, elemCountMap.getOrDefault(num, 0) + 1);
            //getOrDefault - if key num present add 1 to value and set value, if it is not present then set value as 0. 
        }
        System.out.println(elemCountMap); 
        //Create a priority queue (Min heap)
        PriorityQueue<Integer> pq = 
        new PriorityQueue<Integer>((num1, num2) -> elemCountMap.get(num1) -                     elemCountMap.get(num2)); //since min heap put lower in front. 
        System.out.println(elemCountMap.keySet());
        for(int num : elemCountMap.keySet()) { //creates set of all keys 
            pq.add(num);
            System.out.println(pq); 
            if (pq.size() > k) 
                pq.poll();    //removes highest prior one which is min 
            }
        int[] resultArr = new int[k];
        for(int i = k - 1; i >= 0; --i) 
            resultArr[i] = pq.poll();
        return resultArr;
    }
}

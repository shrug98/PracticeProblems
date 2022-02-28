import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        //adding array elements to priority queue in descending order 
        PriorityQueue<Integer> st = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            st.add(stones[i]); //add array elements in queue
        }
        while(st.size()>1){
            int max = st.poll(); //sets last value to max and removes it from queue
            int smax = st.poll(); //sets last value (2nd highest) and removes from queue
            if (max != smax) st.add(max-smax); //adds difference back to queue if not same
            
        
    }
    if(st.isEmpty()) return 0;
    return st.poll(); //return last element 
    }
}

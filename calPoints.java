//At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record
//An integer x - Record a new score of x.
//"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
//"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
//"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
//Return the sum of all the scores on the record.

import java.util.ArrayList;
class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> record = new ArrayList<Integer>(); //store records for easy add and remove
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("+")) {
                //adds last two elements in arraylist 
                int sum = record.get(record.size()-1) + record.get(record.size()-2);
                record.add(sum);
            }
            else if(ops[i].equals("D")){
                //doubles last element in arraylist 
                int d = 2*(record.get(record.size()-1));
                record.add(d);
            }
            else if(ops[i].equals("C")){
                //removes last element in arraylist 
                record.remove(record.size()-1);
            }
            else{
                //adds integer to arraylist 
                record.add(Integer.valueOf(ops[i]));
            }
        }
        int sum = 0;
        for(int i = 0; i < record.size(); i++){
            sum += record.get(i);
        }
        return sum; 
    }
}

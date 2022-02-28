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

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int total = 0;
        for (int i = 0; i < employees.size(); i++){
            if(employees.get(i).id == id){
                total += employees.get(i).importance;
                if(!(employees.get(i).subordinates.isEmpty())){
                    for(int j = 0; j < (employees.get(i).subordinates).size(); j++){
                        for(int k = 0; k < employees.size(); k++){
                            if(employees.get(k).id == employees.get(i).subordinates.get(j)){
                                total+=employees.get(k).importance;
                                break;
                            } 
                    }
                }
            }
        }
    }
        return total;
}
}

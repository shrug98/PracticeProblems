//You have a data structure of employee information, including the employee's unique ID, importance value, and direct subordinates' IDs.

//You are given an array of employees employees where:

//    employees[i].id is the ID of the ith employee.
//    employees[i].importance is the importance value of the ith employee.
//    employees[i].subordinates is a list of the IDs of the direct subordinates of the ith employee.

//Given an integer id that represents an employee's ID, return the total importance value of this employee and all their direct and indirect subordinates.


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
        int f = 0;
        for (int i = 0; i < employees.size(); i++){
            if(employees.get(i).id == id){
                f = 1;
                total += employees.get(i).importance;
                if(!(employees.get(i).subordinates.isEmpty())){
                    for(int j = 0; j < (employees.get(i).subordinates).size(); j++){
                        total += getImportance(employees, employees.get(i).subordinates.get(j));
                            } 
                    }
                }
            if (f == 1) break;
            }
        return total;
    }
}

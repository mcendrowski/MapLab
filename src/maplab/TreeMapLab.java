/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab;

//import java.util.Map;
//import java.util.TreeMap;
import java.util.*;

/**
 *
 * @author mcendrowski
 */
public class TreeMapLab {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Black", "Joe", "111111111");
        Employee emp2 = new Employee("Brown", "Sam", "222222222");
        Employee emp3 = new Employee("White", "Jack", "111111111");
        Employee emp4 = new Employee("Brown", "Jenny", "44444444");

        Map<String, Employee> map = new TreeMap<>();

        map.put(emp1.getSsn(), emp1);
        map.put(emp2.getSsn(), emp2);
        map.put(emp3.getSsn(), emp3);
        map.put(emp4.getSsn(), emp4);
        System.out.println("\n----------------------------------- sorted by natural ordering (ssn) ----------------\n");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Employee emp = map.get(key);
            System.out.println(emp.toString());
        }

        System.out.println("\n----------------------------------- sorted by comparator ------------------------\n");
        Collection<Employee> collection = map.values();
        List<Employee> list = new ArrayList(collection); //new ArrayList<>();
        Collections.sort(list, new EmployeeByLastThenFirstName());

        for (Employee emp : list) {
            System.out.println(emp.toString());
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mcendrowski
 */
public class TreeSetLab {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Black", "Joe", "111111111");
        Employee emp2 = new Employee("Brown", "Sam", "222222222");
        Employee emp3 = new Employee("White", "Jack", "111111111");
        Employee emp4 = new Employee("Brown", "Jenny", "44444444");
        
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        
        
        Set<Employee> set = new TreeSet<>(list);
        
        list = new ArrayList<>(set);
        
        System.out.println("----------------------- natural sorting ------------------------");
        
        Collections.sort(list);
        
        for(Employee emp: list){
            System.out.println(emp.toString());
        }
        System.out.println("----------------------- using iterator ------------------------");
        for (Iterator it = list.iterator(); it.hasNext();) {
            Object emp = it.next();
            System.out.println(((Employee)emp).toString());
        }
        
        System.out.println("----------------------- alternative sorting ------------------------");
        
        Collections.sort(list,new EmployeeByLastThenFirstName());
        
        for(Employee emp: list){
            System.out.println(emp.toString());
        }
        System.out.println("----------------------- using iterator ------------------------");
        for (Iterator it = list.iterator(); it.hasNext();) {
            Object emp = it.next();
            System.out.println(((Employee)emp).toString());
        }
    }
}

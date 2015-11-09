/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MCENDROWSKI
 */
public class MapLab1Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lab1Generic();
    }
    
    public static void lab1Generic(){
        
        Employee emp1 = new Employee("Black","Joe","111111111");
        Employee emp2 = new Employee("Brown","Sam","222222222");
        Employee emp3 = new Employee("White","Jack","111111111");
        Employee emp4 = new Employee("Smith","Jenny","44444444");
        
         Map<String,Employee> map = new HashMap<>();
        map.put(emp1.getSsn(), emp1);
        map.put(emp2.getSsn(), emp2);
        map.put(emp3.getSsn(), emp3);
        map.put(emp4.getSsn(), emp4);
        
        
        Employee employee = map.get("44444444");
        
        
        System.out.println(employee.toString());
        System.out.println("\n----------------------------------\n");
        
        Set<String> keys = map.keySet();
        
        for(String key: keys){
            System.out.println(key);
        }
        System.out.println("\n--------------- looping through the keys ----------------------------\n");
        for(String key : keys) {
            Employee emp = map.get(key);
            System.out.println(emp.toString());
        }
        
         System.out.println("\n--------------- looping through the keys but from collection ----------------------------\n");
        Collection<String> keys2 = map.keySet();
         for(String key : keys2) {
            Employee emp = map.get(key);
            System.out.println(emp.toString());
        }
        
        System.out.println("\n--------------- looping through values ---------------------------------\n");
        
        Collection<Employee> values = map.values();
        for(Employee value: values){
            System.out.println(value);
        }
    }
    
    
}

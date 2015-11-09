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
public class MapLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lab1NotGeneric();
    }
    
    public static void lab1NotGeneric(){
        
        Employee emp1 = new Employee("Black","Joe","111111111");
        Employee emp2 = new Employee("Brown","Sam","222222222");
        Employee emp3 = new Employee("White","Jack","111111111");
        Employee emp4 = new Employee("Smith","Jenny","44444444");
        
         Map map = new HashMap();
        map.put(emp1.getSsn(), emp1);
        map.put(emp2.getSsn(), emp2);
        map.put(emp3.getSsn(), emp3);
        map.put(emp4.getSsn(), emp4);
        
        
        Object employee = map.get("44444444");
        
        Employee employee2 = (Employee)employee;
        System.out.println(employee2.toString());
        System.out.println("----------------------------------");
        
        Set keys = map.keySet();
        
        for(Object key: keys){
            System.out.println(key);
        }
        for(Object key : keys) {
            Employee emp = (Employee)map.get(key);
            System.out.println(emp.toString());
        }
        
        Collection values = map.values();
        for(Object value: values){
            System.out.println(value);
        }
    }
    
    
}

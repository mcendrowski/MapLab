package maplab;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * This Comparator implementation offers an alternate way to sort
 * Employee entities -- by LastName
 * 
 * @author jlombardo
 */
public class EmployeeByLastThenFirstName implements Comparator<Employee> {

//    public int compare(Employee e1, Employee e2) {
//        
//         
//        
//        return e1.getLastName().compareTo(e2.getLastName());
//    }
      @Override
      public int compare(Employee e1, Employee e2) {       

        
        return new CompareToBuilder()
               .append(e1.getLastName(), e2.getLastName())
                .append(e1.getFirstName(), e2.getFirstName())
               .toComparison();
        

    }
    
}

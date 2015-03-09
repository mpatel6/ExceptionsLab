package lab0;

import java.util.Date;

/**
 *
 * @author Instlogin
 */
public class Startup {
    private String lastName;
    private String firstName;
    private Date hireDate = new Date();
    private int vacationDays=15;
    private String ssn;
    private boolean b;
    

    
    public static void main(String[] args) {
        Startup start = new Startup();

        Employee emp = new Employee(
            "John",
            "Smith",
            "333-33-3333",
            start.hireDate,
            start.vacationDays);
         
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
        
        System.out.println(fullNameInCaps);
        System.out.println(emp.getHireDate());
        System.out.println(emp.getDaysVacation());
        System.out.println(emp.getSsn());
    }
}

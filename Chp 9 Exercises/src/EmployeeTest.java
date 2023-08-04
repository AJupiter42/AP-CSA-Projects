
public class EmployeeTest {
	
	public static void main(String[] args) {
		
		CommissionEmployee employee1 = new CommissionEmployee("Jimmy", "Johns", 12345, 50000.00, 3.05); 
		System.out.println(employee1.toString()); 
		
		System.out.println();
		
		BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Danny", "Davis", 67890, 25000.00, 50000.00, 2.55); 
		System.out.println(employee2.toString()); 
		
		System.out.println(); 
		
		HourlyEmployee employee3 = new HourlyEmployee("Jeffy", "Jebs", 54321, 12.00, 40); 
		System.out.println(employee3.toString()); 
		
	} 

} 

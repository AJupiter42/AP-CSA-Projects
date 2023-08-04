
package Problem16;

public class Problem16 {
	
	public static void main(String[] args) {
		
		Payable[] payableObjects = new Payable[6]; 
		
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00); 
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95); 
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00); 
		payableObjects[3] = new HourlyEmployee("Joe", "Biden", "345678", 30, 10); 
		payableObjects[4] = new CommissionEmployee("Elon", "Musk", "123456", 5000, 0.03); 
		payableObjects[5] = new BasePlusCommissionEmployee("Bill", "Gates", "789012", 5000, 0.03, 300);  
		
		for (Payable currentPayable : payableObjects) {
			
			System.out.printf("%n%s", currentPayable.toString()); 
			
			if (currentPayable instanceof BasePlusCommissionEmployee) {
				
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable; 
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
			}
			
			System.out.printf("%n%s: $%,.2f%n", "payment due", currentPayable.getPaymentAmount()); 
			
		}
		
	}

}

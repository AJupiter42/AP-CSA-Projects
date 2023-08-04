
public class Invoice {
	
	// instance variables
	private String PartNumber; 
	private String PartDescription;
	private int QuantityPurchased;
	private double PricePerItem;
	private double InvoiceAmount;
	
	// Invoice constructor
	public Invoice(String PartNumber, String PartDescription,
			int QuantityPurchased, double PricePerItem) {
		
		this.PartNumber = PartNumber;
		this.PartDescription = PartDescription;
		this.QuantityPurchased = QuantityPurchased;
		
	}
	
	public void setPartNumber(String PartNumber) {
		
		this.PartNumber = PartNumber;
		
	}
	
	public void setPartDescription(String PartDescription) {
		
		this.PartDescription = PartDescription;
		
	}

	public void setQuantityPurchased(int QuantityPurchased) {
	
	this.QuantityPurchased = QuantityPurchased;
	
	}

	public void setPricePerItem(double PricePerItem) {
	
	this.PricePerItem = PricePerItem;
	
	}
	
	public String getPartNumber() {
		
		return PartNumber;
	}
	
	public String getPartDescription() {
		
		return PartDescription;
	}
	
	public int getQuantityPurchased() {
		
		return QuantityPurchased;
		
	}
	
	public double getPricePerItem() {
		
		return PricePerItem;
		
	}
	
	public double getInvoiceAmount(int QuantityPurchased, double PricePerItem) {
		
		if (PricePerItem < 0)
			PricePerItem = 0; 
		
		if (QuantityPurchased > 0)
			InvoiceAmount = QuantityPurchased * PricePerItem;
		
		return InvoiceAmount; 
	
	}

}

public class Order {
	private int customerID;
	private int orderID;
	private int itemID;
    private double itemWieght;
    private int itemquantity;
    private double itembill;
    private int orderquanity;
    private int containerID;
    private boolean containeravailability;
    private double shippingBill;
    private double[] customerlocation=new double [3]; 
    private double[] itemlocation=new double [3];

    
    
public Order() {
		
		
	}

public static void main(String[] args) {

}
    
    
    public void listpendingorders() {
    	
    	
    }
    
    public void availableorders() {
    	
    	
    }
    
    public void searchorders(){
    	
    	
    }
    
    public void paymentrecieve() {
    	
    	
    	
    }
    
    
	

	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public double getItemWieght() {
		return itemWieght;
	}

	public void setItemWieght(int itemWieght) {
		this.itemWieght = itemWieght;
	}

	public int getItemquantity() {
		return itemquantity;
	}

	public void setItemquantity(int itemquantity) {
		this.itemquantity = itemquantity;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public double getShippingBill() {
		return shippingBill;
	}

	public void setShippingBill(double shippingBill) {
		this.shippingBill = shippingBill;
	}

	public double getItembill() {
		return itembill;
	}

	public void setItembill(double itembill) {
		this.itembill = itembill;
	}

	public double[] getCustomerlocation() {
		return customerlocation;
	}

	public void setCustomerlocation(double[] customerlocation) {
		this.customerlocation = customerlocation;
	}

	public double[] getItemlocation() {
		return itemlocation;
	}

	public void setItemlocation(double[] itemlocation) {
		this.itemlocation = itemlocation;
	}




	public int getContainerID() {
		return containerID;
	}




	public void setContainerID(int containerID) {
		this.containerID = containerID;
	}




	public boolean isContaineravailability() {
		return containeravailability;
	}




	public void setContaineravailability(boolean containeravailability) {
		this.containeravailability = containeravailability;
	}

	public int getOrderquanity() {
		return orderquanity;
	}

	public void setOrderquanity(int orderquanity) {
		this.orderquanity = orderquanity;
	}

	

}
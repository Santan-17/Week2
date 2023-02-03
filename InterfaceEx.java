package NewPrograms;
interface tax{
	double Calculatetax(double price);
	
}
  class purchasedetails implements tax{
	 String purchaseid;
	 String paymenttype;
	 double taxpercent;
	 public purchasedetails(String purchaseid,String paymenttype) {
		 this.purchaseid=purchaseid;
		 this.paymenttype=paymenttype;
		 
	 }
	public String getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(String purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public double getTaxpercent() {
		return taxpercent;
	}
	public double setTaxpercent(double taxpercent) {
		return this.taxpercent = taxpercent;
	}
	public double Calculatetax (double price){
		double m=0;
		double purchaseamount=0;
		if(paymenttype.equals("Debit Card")) {
			m=0.02*price;
			purchaseamount =Math.round(m+price);
			setTaxpercent(m);
			
		}else if (paymenttype.equals("Credit Card")) {
			m=0.03*price;
			purchaseamount =Math.round(m+price);
			setTaxpercent(m);
		}else {
			m=0.04*price;
			purchaseamount =Math.round(m+price);
			setTaxpercent(m);
		}
		return purchaseamount;
		
	}
}
  class seller implements tax{
	  String location;
	  double taxpercentage;
	  public seller(String location) {
		  this.location=location;
		  
	  }
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxpercentage() {
		return taxpercentage;
	}
	public double setTaxpercentage(double taxpercentage) {
		return this.taxpercentage = taxpercentage;
	}
	public double Calculatetax (double price) {
		double m = 0;
		double purchaseamount=0;
		if(location.equals("Middle east")) {
			m=0.15*price;
			purchaseamount =Math.round(m+price);
			setTaxpercentage(m);
			
			
			
		}else if(location.equals("Europe")) {
			m=0.25*price;
		    purchaseamount= Math.round(m+price);
			setTaxpercentage(m);
					
		}
		else if(location.equals("Canada")) {
			m=0.22*price;
			 purchaseamount= Math.round(m+price);
			setTaxpercentage(m);
			
		}else if (location.equals("Japan")) {
			m=0.12*price;
			 purchaseamount= Math.round(m+price);
			setTaxpercentage(m);
		}
		
		
		return purchaseamount;		
	}
  }
 

public class InterfaceEx {
	 public static void main(String args[])
	 {
		 System.out.println("Purchase Details\n***************");
		 purchasedetails k = new  purchasedetails("P1001","Credit Card");
		 System.out.println("Total purchase amount: " +k.Calculatetax(100));
		 System.out.println("Tax percentage: "+k.getTaxpercent());
		 System.out.println("Seller Details\n***************");
		  seller s = new seller("Canada");
		  
		 System.out.println("Tax to be paid by the seller: " +s.Calculatetax(100));
		 
		 System.out.println("Tax percentage: " +s.getTaxpercentage());
		 
		 }
		}



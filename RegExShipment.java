package programs;
class Shipment{
	public boolean checkProductName(String productName){
String regex = "^[a-zA-Z]{1,15}\\s[a-zA-Z]{1,15}(?;\\s[a-zA-Z]{1,15})?$";
if(productName.matches(regex))
{
	return true;
}
return false;
	}
	public boolean checkProductIdValidity(String productId) {
		cString regex = "^[\\w]{2,20}";
		if(productId.matches(regex))
		{
			return true;
		}
		return false;
	}
	public boolean checlTrackerIdValidity(String trackerId) {
		String regex = ^"[A-Z]{1}[\\:]{1}[A-Z]{4}[\\:][a-z]{3}[\\:][0-9]{2}$";
		if (trackerId.matches(regex))
		{
			return true;
		}
		return false;
	}
	
public class RegExShipment {

	public static void main(String[] args) {
		Shipment shipment = new Shipment();
		String productName = "Digital Camera";
		System.out.println("The product name is "+ (shipment.checkProductNameValidity(productname)?"valid!":"invalid!"));
		String productId = "DC1911";
		 System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));
			
		 String trackerId = "D:CMDC:cmd:23";
		 System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));

	}

}

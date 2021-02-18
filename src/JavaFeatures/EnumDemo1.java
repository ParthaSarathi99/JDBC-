package JavaFeatures;

public class EnumDemo1 {
	public enum EnumCompany {
		 
		GOOGLE("G"), YAHOO("Y"), EBAY("E"), PAYPAL("P");
	 
		private String companyLetter;
	 
		private EnumCompany(String s) {
			companyLetter = s;
		}
	 
		public String getCompanyLetter() {
			return companyLetter;
		}}
	
	public static void main(String[] args) {
		System.out.println("Get enum value for Comapny 'eBay': "
				+ EnumCompany.EBAY.getCompanyLetter());

	}

}

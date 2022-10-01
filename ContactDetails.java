package p1;

public class ContactDetails {
	private int houseNumber;
	private String cityName;
	private String stateName;
	private String countryName;
	private int pinCode;
	private String emailID;
	private int mobileNumber;
	
	public ContactDetails() {
	super();
		//TODO Auto-generated constructor stub
	}
	public ContactDetails(int houseNumber,String cityName,String stateName,String countryName,int pinCode,
			String emailID,int mobileNumber) {
		super();
		this.houseNumber=houseNumber;
		this.cityName=cityName;
		this.stateName=stateName;
		this.countryName=countryName;
		this.pinCode=pinCode;
		this.emailID=emailID;
		this.mobileNumber=mobileNumber;
	}
	
		public int getHouseNumber() {
			return houseNumber;
		}
		
		public void setHouseNumber(int houseNumber) {
			this.houseNumber=houseNumber;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName() {
			this.cityName=cityName;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName() {
			this.stateName=stateName;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryname) {
			this.countryName=countryName;
		}
		public int getPinCode() {
			this.pinCode=pinCode;
		}
		public String getemailID() {
			return emailID;
		}
		public void setemailID(String emailID) {
			this.emailID=emailID;
		}
		public int getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(int mobilrNumber) {
			this.mobileNumber=mobileNumber;
		}
}
		
	
	



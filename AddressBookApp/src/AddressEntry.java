public class AddressEntry {

	
private String firstName;
 private String lastName;
 private String streetName;
 private String cityName;
 private String stateName;
 private int zipcode;
 private String phoneNumber;
 private String emailId;
 
 AddressEntry()
 {
	 firstName="Amit";
	 lastName="JAin";
	 streetName="baba";
	 cityName="c";
	 stateName="s";
	 zipcode= 0;
	 phoneNumber="p";
	 emailId="e"; 
 }
		
 
 AddressEntry(String firstName,String lastName,String streetName,String cityName, String stateName, int zipcode,String phoneNumber,String emailId)
 {
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.streetName=streetName;
	 this.cityName=cityName;
	 this.stateName=stateName;
	 this.zipcode=zipcode;
	 this.phoneNumber=phoneNumber;
	 this.emailId=emailId;
 }
 
 public String getFirstName()
 {
	 return firstName;
 }
 
 public void setFirstName(String fname )
 {
	 firstName=fname;
 }
 
 
 public String getLastName()
 {
	 return lastName;
 }
 public void setLastName(String lname )
 {
	 lastName=lname;
 }
 public String getStreetName()
 {
	 return streetName;
 }
 
 public void setStreetName(String streetname )
 {
	 streetName=streetname;
 }
 
 public String getCityName()
 {
	 return cityName;
 }
 
 public void setCityName(String cityname )
 {
	 cityName=cityname;
 }
 public String getStateName()
 {
	 return stateName;
 }
 
 
 public void setStateName(String statename)
 {
	 stateName=statename;
 }
 
 public int getZipCode()
 {
	 return zipcode;
 }
 
 public void setZip(int zip)
 {
	 zipcode=zip;
 }
 
 public String getPhoneNumber()
 {
	 return phoneNumber;
 }
 
 public void setPhoneNumber(String phonenumber)
 {
	 phoneNumber=phonenumber;
 }
 
 
 public String getEmailId()
 {
	 return emailId;
 }
 
 public void setEmail(String email)
 {
	 emailId=email;
 }
 
 public String toString() {
    
    	String summary=new String();
summary= "First Name=" + firstName + ", Last Name=" + lastName + ", City="
             + cityName + ", state=" + stateName + ", zip=" + zipcode
             + ", phone=" + phoneNumber +",email="+emailId+",street ="+streetName;
 return summary;
 }

 
 
 }
 


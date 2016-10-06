


//import java.util.ArrayList;

public class AddressBookApplication {
	public static void initAddressBookExcercise(AddressBook ab)
	{
	AddressEntry ae1=new AddressEntry("Lynne","Grewe"," streetName","cityName","stateName",3455," phoneNumber","grewe@gmail.com");
	AddressEntry ae2=new AddressEntry("Priyanka","Nalawade"," streetName","cityName","stateName",1232," phoneNumber","piyu@gmail.com");
		ab.add(ae1);
		ab.add(ae2);
		ab.list();
	}

	
	 
	public static void main(String args[]) {
		
		AddressBook ab =new AddressBook();
		initAddressBookExcercise(ab);
	
		

	}
}


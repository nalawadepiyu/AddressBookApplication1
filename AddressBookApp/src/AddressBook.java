import java.util.ArrayList;
public class AddressBook {


private ArrayList<AddressEntry> addressEntryList=new ArrayList<AddressEntry>();


//Initializes an array of entries, then loops through to initialize each individual entry


public  void list() {
	for(AddressEntry e: addressEntryList)
	{
	System.out.println(e.toString());
	}
	}


public void add (AddressEntry ae)
{
	addressEntryList.add(ae);
    }
	
}








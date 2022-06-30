package oopsproblems;

public class PersonDetails {
	public static String firstName;
	public static String lastName;
	public static String address;
	public static String city;
	public static String state;
	public static int zipNo;
	public static long phoneNo;
	public PersonDetails(String firstName, String lastName, String address, String city, String state, int zipNo,
			long phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipNo = zipNo;
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipNo() {
		return zipNo;
	}

	public void setZip(int zip) {
		this.zipNo = zipNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
        + city + ", state=" + state + ", zip=" + zipNo + ", phoneNumber=" + phoneNo
        + "]";
	}
}

package hummanResourseSystems;

public class Student {
	String id;
	String name;
	String address;
	String phoneNumber;
	String email;
	
	public Student() {
		super();
		this.id = "";
		this.name = "";
		this.address = "";
		this.phoneNumber = "";
		this.email = "";
	}
	public Student(String id, String name, String address, String phoneNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

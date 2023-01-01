package DiamonShop.Entity;

public class Users {
	private long id;
	private String user;
	private String password;
	private String display_name;
	private String address;
	private int phone;
	public Users() {
		super();
	}
	public Users(long id, String user, String password, String display_name, String address, int phone) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.display_name = display_name;
		this.address = address;
		this.phone = phone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}

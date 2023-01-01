package DiamonShop.Entity;

public class BillDetail {
	private long id;
	private long id_product;
	private long id_bills;
	private int quantity;
	private double total;
	public BillDetail() {
		super();
	}
	public BillDetail(long id, long id_product, long id_bills, int quantity, double total) {
		super();
		this.id = id;
		this.id_product = id_product;
		this.id_bills = id_bills;
		this.quantity = quantity;
		this.total = total;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_product() {
		return id_product;
	}
	public void setId_product(long id_product) {
		this.id_product = id_product;
	}
	public long getId_bills() {
		return id_bills;
	}
	public void setId_bills(long id_bills) {
		this.id_bills = id_bills;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}

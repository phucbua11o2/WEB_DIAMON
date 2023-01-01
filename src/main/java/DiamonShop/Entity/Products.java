package DiamonShop.Entity;

import java.sql.Date;

public class Products {
	private long id; 
	private int id_category;
	private String sizes;
	private String name;
	private double price;
	private  int sale;
	private String title;
	private boolean highlight;
	private boolean new_product;
	private String details;
	private Date created_at;
	private Date updated_at;
	public Products() {
		super();
	}
	public Products(long id, int id_category, String sizes, String name, double price, int sale, String title,
			boolean highlight, boolean new_product, String details, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.id_category = id_category;
		this.sizes = sizes;
		this.name = name;
		this.price = price;
		this.sale = sale;
		this.title = title;
		this.highlight = highlight;
		this.new_product = new_product;
		this.details = details;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isHighlight() {
		return highlight;
	}
	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}
	public boolean isNew_product() {
		return new_product;
	}
	public void setNew_product(boolean new_product) {
		this.new_product = new_product;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
}

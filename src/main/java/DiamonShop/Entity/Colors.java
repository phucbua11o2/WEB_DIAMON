package DiamonShop.Entity;

public class Colors {
	private long id;
	private long id_product;
	private String name;
	private String code;
	private String img;
	public Colors() {
		super();
	}
	public Colors(long id, long id_product, String name, String code, String img) {
		super();
		this.id = id;
		this.id_product = id_product;
		this.name = name;
		this.code = code;
		this.img = img;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}

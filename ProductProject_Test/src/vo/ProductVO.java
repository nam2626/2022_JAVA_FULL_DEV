package vo;

public class ProductVO {
	private String no;
	private String name;
	private String maker;
	private int ea;
	private String storage;
	
	public ProductVO(String no, String name, String maker, int ea, String storage) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.ea = ea;
		this.storage = storage;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public void printProductInfo() {
		System.out.println(no + " " + name + " " + maker + " " + ea + " " + storage);
	}

	@Override
	public String toString() {
		return "ProductVO [no=" + no + ", name=" + name + ", maker=" + maker + ", ea=" + ea + ", storage=" + storage
				+ "]";
	}
	
	
	
}

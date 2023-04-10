package OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	private int i_id;
	private String iname;
	private double price;
	
	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name="aaaaa")
	private Amazon amazon;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int i_id, String iname, double price, Amazon amazon) {
		super();
		this.i_id = i_id;
		this.iname = iname;
		this.price = price;
		this.amazon = amazon;
	}

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String name) {
		this.iname = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Amazon getAmazon() {
		return amazon;
	}

	public void setAmazon(Amazon amazon) {
		this.amazon = amazon;
	}

//	@Override
//	public String toString() {
//		return "Item [i_id=" + i_id + ", iname=" + iname + ", price=" + price + ", amazon=" + amazon + "]";
//	}
	
	
}

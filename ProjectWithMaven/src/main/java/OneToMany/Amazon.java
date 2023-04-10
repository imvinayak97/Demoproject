package OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Amazon {

	@Id
	private int aid;
	private String name;
	
	@OneToMany(mappedBy = "amazon",fetch = FetchType.EAGER)//,cascade = CascadeType.ALL)
	private List<Item> item;

	public Amazon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amazon(int aid, String name, List<Item> item) {
		super();
		this.aid = aid;
		this.name = name;
		this.item = item;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Amazon [aid=" + aid + ", name=" + name +  "]";
	}
	
	
}

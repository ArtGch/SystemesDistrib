import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	private int code;
	private String designation;
	private double prix;

	public Product () {
		super();
	}
	
	public Product(int code, String designation, double prix) {
		super();
		this.code = code;
		this.designation = designation;
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "Product [code=" + code + ", designation=" + designation + ", prix=" + prix + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
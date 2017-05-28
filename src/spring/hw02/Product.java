package spring.hw02;

import javax.validation.constraints.Pattern;

public class Product {
	@Pattern(regexp="^[a-z0-9_]{5,12}$", message="아이디 형식X")
	private String pid;
	private String pname;
	private String price;
	private String pdate;
	private String content;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price
				+ ", pdate=" + pdate + ", content=" + content + "]";
	}
	
	
}

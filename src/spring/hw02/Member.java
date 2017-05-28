package spring.hw02;

import javax.validation.constraints.Pattern;

public class Member {
	@Pattern(regexp="^[a-z0-9_]{5,12}$", message="아이디 형식X")
	private String id;
	
	private String password;
	
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", email="
				+ email + "]";
	}
}

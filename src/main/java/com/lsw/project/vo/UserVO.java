package com.lsw.project.vo;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class UserVO {
	private String id;
	private String pass;
	private String name;
	private int age;
	private String pnum;
	private String area;
	private int gender;
	private String email;
	private String rdate;
	private String adminid;
	private String updateid;
	private String adminday;
	private String updateday;
	
	public UserVO() {
		super();
	}

	public UserVO(String id, String pass, String name, int age, String pnum, String area, int gender, String email,
			String rdate, String adminid, String updateid, String adminday, String updateday) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.pnum = pnum;
		this.area = area;
		this.gender = gender;
		this.email = email;
		this.rdate = rdate;
		this.adminid = adminid;
		this.updateid = updateid;
		this.adminday = adminday;
		this.updateday = updateday;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getUpdateid() {
		return updateid;
	}

	public void setUpdateid(String updateid) {
		this.updateid = updateid;
	}

	public String getAdminday() {
		return adminday;
	}

	public void setAdminday(String adminday) {
		this.adminday = adminday;
	}

	public String getUpdateday() {
		return updateday;
	}

	public void setUpdateday(String updateday) {
		this.updateday = updateday;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + ", pnum=" + pnum + ", area="
				+ area + ", gender=" + gender + ", email=" + email + ", rdate=" + rdate + ", adminid=" + adminid
				+ ", updateid=" + updateid + ", adminday=" + adminday + ", updateday=" + updateday + "]";
	}
	
	
}

package com.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="phones")
	private String phone;
	
	private String password;
	
	@Column(name="nickname")
	private String nickName;
	
	@Formula(value="(select count(*) from fun as f where f.user_id = id)")
	private int funCount;
	
	@Formula(value="(select count(*) from dylike as d where d.user_id = id)")
	private int likeCount;
	
	private String avatar;
	private String description;
	private String address;
	public User() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getFunCount() {
		return funCount;
	}
	public void setFunCount(int funCount) {
		this.funCount = funCount;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", password=" + password + ", nickName=" + nickName
				 + ", funCount=" + funCount + ", likeCount=" + likeCount + ", avatar="
				+ avatar + ", description=" + description + ", address=" + address + "]";
	}

	
	
}

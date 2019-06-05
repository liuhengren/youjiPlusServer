package com.bean;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dylike")
public class DyLike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name="dynamic_id")
	@Basic(fetch=FetchType.LAZY)
	private Dynamic dynamic;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Dynamic getDynamic() {
		return dynamic;
	}
	public void setDynamic(Dynamic dynamic) {
		this.dynamic = dynamic;
	}
	public DyLike() {
		super();
	}
	@Override
	public String toString() {
		return "DyLike [id=" + id + ", user=" + user + ", dynamic=" + dynamic + "]";
	}
	
	
}

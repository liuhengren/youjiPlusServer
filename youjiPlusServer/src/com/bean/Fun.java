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
@Table(name="fun")
public class Fun {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name="fun_user_id")
	private User funUser;
	
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
	public User getFunUser() {
		return funUser;
	}
	public void setFunUser(User funUser) {
		this.funUser = funUser;
	}
	public Fun() {
		super();
	}
	@Override
	public String toString() {
		return "Fun [id=" + id + ", user=" + user + ", funUser=" + funUser + "]";
	}
	
	
}

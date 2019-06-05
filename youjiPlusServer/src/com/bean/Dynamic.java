package com.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;
@Entity
@Table(name="dynamic")
public class Dynamic {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	private String content;
	
	private String image;
	
	@Formula(value="(select count(*) from dylike as ddl where ddl.dynamic_id = id)")
	private int likeCount;
	
	@Formula(value="(select count(*) from commnet as com where com.dynamic_id = id)")
	private int commentCount;
	
	private Timestamp time;
	
	@OneToMany(mappedBy="dynamic",cascade=CascadeType.ALL,targetEntity=Commnet.class)
	private Set<Commnet> commnets =new HashSet<>();
	
	public Dynamic() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//添加映射
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Set<Commnet> getCommnets() {
		return commnets;
	}
	public void setCommnets(Set<Commnet> commnets) {
		this.commnets = commnets;
	}
	@Override
	public String toString() {
		return "Dynamic [id=" + id + ", user=" + user + ", content=" + content + ", image=" + image + ", likeCount="
				+ likeCount + ", commentCount=" + commentCount + ", time=" + time + ", commnets=" + commnets + "]";
	}

	
}

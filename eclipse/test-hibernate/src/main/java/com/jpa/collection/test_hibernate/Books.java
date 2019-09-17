package com.jpa.collection.test_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class Books {

	@Id
	private int bookid;
	private String bname;
	private String bauthor;
	private double bprice;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bname=" + bname + ", bauthor=" + bauthor + ", bprice=" + bprice + "]";
	}
	

	
	
}

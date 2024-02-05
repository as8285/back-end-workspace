package com.kh.model;

public class Book {
private int bk_no;
private String bk_title;
private String bk_author;
private int bk_price;
private int pub_no;
public Book(int bk_no, String bk_title, String bk_author, int bk_price, int pub_no) {

	this.bk_no = bk_no;
	this.bk_title = bk_title;
	this.bk_author = bk_author;
	this.bk_price = bk_price;
	this.pub_no = pub_no;
}
public Book() {
	
	
}
public int getBk_no() {
	return bk_no;
}
public void setBk_no(int bk_no) {
	this.bk_no = bk_no;
}
public String getBk_title() {
	return bk_title;
}
public void setBk_title(String bk_title) {
	this.bk_title = bk_title;
}
public String getBk_author() {
	return bk_author;
}
public void setBk_author(String bk_author) {
	this.bk_author = bk_author;
}
public int getBk_price() {
	return bk_price;
}
public void setBk_price(int bk_price) {
	this.bk_price = bk_price;
}
public int getPub_no() {
	return pub_no;
}
public void setPub_no(int pub_no) {
	this.pub_no = pub_no;
}
@Override
public String toString() {
	return "Book [ bk_title=" + bk_title + ", bk_author=" + bk_author + ", bk_price=" + bk_price
			+ ", pub_no=" + pub_no + "]";
}

}
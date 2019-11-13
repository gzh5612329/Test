package cn.zjf.bean;

import java.io.Serializable;

public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String acc_no;
	private String acc_password;
	private int acc_money;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String acc_no, String acc_password, int acc_money) {
		super();
		this.id = id;
		this.acc_no = acc_no;
		this.acc_password = acc_password;
		this.acc_money = acc_money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_password() {
		return acc_password;
	}
	public void setAcc_password(String acc_password) {
		this.acc_password = acc_password;
	}
	public int getacc_money() {
		return acc_money;
	}
	public void setacc_money(int acc_money) {
		this.acc_money = acc_money;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", acc_no=" + acc_no + ", acc_password=" + acc_password + ", acc_money="
				+ acc_money + "]";
	}
	
}

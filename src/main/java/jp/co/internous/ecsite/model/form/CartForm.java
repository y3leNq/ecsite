package jp.co.internous.ecsite.model.form;

import java.util.List;

public class CartForm {
	private int userId;
	private List<Cart> cartList;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int id) {
		this.userId = id;
	}
	public List<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
}

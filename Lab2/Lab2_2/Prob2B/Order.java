package Prob2B;

import java.util.List;

public class Order {
	private int orderNum;
	private List<OrderLine> orderList;
	
	Order() {
		
	}
	
	Order(List<OrderLine> list) {
		this.orderList = list;
		this.orderNum = list.size();
	}
	
	public void setOrderList(List<OrderLine> list) {
		this.orderList = list;
		this.orderNum = list.size();
	}
	
	public List<OrderLine> getOrderList() {
		return orderList;
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	
}

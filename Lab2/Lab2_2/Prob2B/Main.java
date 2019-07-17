package Prob2B;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Order order = new Order();
		List<OrderLine> list = new ArrayList<>();
		list.add(new OrderLine(order));
		list.add(new OrderLine(order));
		order.setOrderList(list);
		
		System.out.println(order.getOrderNum());
		System.out.println(order.getOrderList());
	}

}

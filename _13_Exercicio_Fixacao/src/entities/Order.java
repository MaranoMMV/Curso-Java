package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date data = new Date();
	private String orderStatus;
	
	public Order() {	
	}

	public Order(Date data, String orderStatus) {
		this.data = data;
		this.orderStatus = orderStatus;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}

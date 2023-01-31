package com.orders;

import javax.persistence.*;

@Entity
public class Order_Details_Child {
	@Id
	Long Id;
	
	@ManyToOne
	@JoinColumn(name="Order_Id")
	Orders orderId;
	
	@ManyToOne
	@JoinColumn(name="Product_Id")
	Products productId;
	
	int Quantity;
	
	double total_price;
	
      
	
	
	

}

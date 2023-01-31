package com.orders;

import java.util.List;

import javax.persistence.OneToMany;

public class Products {

	@OneToMany(mappedBy = "productId")
	public List<Order_Details_Child>Order_Details;
	
	
	
	
}

package com.orders;
import java.util.List;

import javax.persistence.*;


public class Orders {

	@OneToMany
	(mappedBy = "orderId")
	public List<Order_Details_Child>Order_Details;
     

}

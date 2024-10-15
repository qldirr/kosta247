package kosta.mapper;

import kosta.model.Item;
import kosta.model.Order;

public interface OrderMapper {
	void addOrder(Order order);
	void updateItem(Order order);
	Item findItem(String no);
}

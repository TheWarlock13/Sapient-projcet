package com;

public class Payment {
	
	private double amount;
	public double getAmount() {return amount;}
	public void setAmount(double amount) {this.amount = amount;}
	
	private Order newOrder;
	public Order getNewOrder() {return newOrder;}
	public void setNewOrder(Order newOrder) {this.newOrder = new Order();}

}

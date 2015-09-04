package com;

public class Cash extends Payment{
	
	private double cashTendered; // declaration of variable cashTender of type double
	//getter method for cashTended
	public double getCashTendered() {
		return cashTendered;
	}
	//setter method for cashTender
		public void setCashTendered(double cashTendered) {
			this.cashTendered = cashTendered;
		}
}

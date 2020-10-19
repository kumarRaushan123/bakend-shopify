package com.raushan.shopify.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class MedicneProduct {
	
	
	
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String medicines;
	private String comapny;
	private int unit;
	private String typo;
	private double Cost_Price;
	private double MRP;
	private double quantity;
	private double price;
	private double total;
	private double tp;
	
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMedicines() {
		return medicines;
	}
	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}
	public String getComapny() {
		return comapny;
	}
	public void setComapny(String comapny) {
		this.comapny = comapny;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public String getTypo() {
		return typo;
	}
	public void setTypo(String typo) {
		this.typo = typo;
	}
	public double getCost_Price() {
		return Cost_Price;
	}
	public void setCost_Price(double cost_Price) {
		Cost_Price = cost_Price;
	}
	public double getMRP() {
		return MRP;
	}
	public void setMRP(double mRP) {
		MRP = mRP;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTp() {
		return tp;
	}
	public void setTp(double tp) {
		this.tp = tp;
	}
	
	
	
	
	
	

}


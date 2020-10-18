package com.raushan.shopify.entities;

import javax.persistence.Entity;

@Entity
public class MedicneProduct {
	
	
	
	
	
	@javax.persistence.Id
	private int Id;
	private String medicines;
	private String comapny;
	private int unit;
	private String typo;
	private float Cost_Price;
	private float MRP;
	private float quantity;
	private float price;
	
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUnit() {
		return unit;
	}
	
	
	
	public void setUnit(int unit) {
		this.unit = unit;
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
	
	
	public String getTypo() {
		return typo;
	}
	public void setTypo(String typo) {
		this.typo = typo;
	}
	public float getCost_Price() {
		return Cost_Price;
	}
	public void setCost_Price(float cost_Price) {
		Cost_Price = cost_Price;
	}
	public float getMRP() {
		return MRP;
	}
	public void setMRP(float mRP) {
		MRP = mRP;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}

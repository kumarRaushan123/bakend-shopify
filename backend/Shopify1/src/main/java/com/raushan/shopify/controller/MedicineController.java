package com.raushan.shopify.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raushan.shopify.entities.MedicneProduct;
import com.raushan.shopify.repository.MedicineRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MedicineController {
	
	@Autowired
	private MedicineRepository repo;
	
	
	@RequestMapping(value="/MedicneProduct/", method = RequestMethod.GET)
	public List<MedicneProduct> getProducts(){
		
		double total = 0;
	
		List<MedicneProduct> mediProd = repo.findAll();
		
		for(int i=0;i<mediProd.size();i++) {
			
			//price
			if(mediProd.get(i).getTypo().equalsIgnoreCase("tablet")) {
				double price = (mediProd.get(i).getQuantity()/mediProd.get(i).getUnit())*mediProd.get(i).getMRP();
				mediProd.get(i).setPrice(price);	
			}else {
				double price  = mediProd.get(i).getQuantity()*mediProd.get(i).getMRP();
				mediProd.get(i).setPrice(price);
			}
			
			
			// total price of individual product
			double tp = mediProd.get(i).getPrice() -(mediProd.get(i).getPrice()*0.05);
			mediProd.get(i).setTp(tp);
			
			// total price after discount
			total += mediProd.get(i).getPrice() -(mediProd.get(i).getPrice()*0.05);
			mediProd.get(i).setTotal(total);
		}
		
		List<MedicneProduct> mp = new ArrayList<MedicneProduct>();
		mp.addAll(mediProd);
		return mp;
		
	}
	
	
	
	
	
	@RequestMapping(value ="/MedicneProduct/{id}", method = RequestMethod.GET)
	public MedicneProduct getProduct(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	
	@RequestMapping(value ="/MedicneProduct/", method = RequestMethod.POST)
	public MedicneProduct createProduct(@RequestBody MedicneProduct product) {
		//System.out.println(product.getMedicines());
		return repo.save(product);
	}
	
	

	@RequestMapping(value ="/MedicneProduct/", method = RequestMethod.PUT)
	public MedicneProduct updateProduct(@RequestBody MedicneProduct product) {
		return repo.save(product);
	}
	
	@RequestMapping(value ="/MedicneProduct/{id}", method = RequestMethod.DELETE)
	public void delProduct(@PathVariable("id") int id) {
		repo.deleteById(id);;
	}

}

package com.xworkz.product.abstracts;

import com.xworkz.product.dto.ProductDto;

public abstract class Product {
	public abstract boolean onSave(ProductDto productDto);
	public abstract void read() ;
	
		
	}
	



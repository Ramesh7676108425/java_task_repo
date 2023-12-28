package com.xworkz.product.abstractimplementation;

import com.xworkz.product.abstracts.Product;
import com.xworkz.product.dto.ProductDto;

public class ProductImpliments extends Product {

	Object[] obj=new Object[2];
	int index=0;
	public boolean onSave(ProductDto productDto) {
		if(productDto!=null) {
			System.out.println("not null");
			if(index<obj.length) {
				obj[index]=productDto;
				index++;
				
			}
			return true;
		}
		else {
			System.out.println("null");
		}
		return false;
	}
	public void read() {
		for(Object object:obj) {
			System.out.println(object);
		}
	}
	

}

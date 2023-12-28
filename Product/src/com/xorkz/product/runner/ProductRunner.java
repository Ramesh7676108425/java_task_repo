package com.xorkz.product.runner;

import com.xworkz.product.abstractimplementation.ProductImpliments;
import com.xworkz.product.abstracts.Product;
import com.xworkz.product.constants.ShopName;
import com.xworkz.product.dto.ProductDto;

public class ProductRunner {
	public static void main(String[] args) {
		Product p=new ProductImpliments();
		ProductDto productDto=new ProductDto();
		productDto.setPrice(656);
		productDto.setProductName(null);
		productDto.setShopName(ShopName.SN1.toString());
		System.out.println(p.onSave(productDto));
		p.read();
		p.onSave(productDto);
	}

}

package com.mrhandosme.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrhandosme.dsdeliver.dto.ProductDTO;
import com.mrhandosme.dsdeliver.entities.Product;
import com.mrhandosme.dsdeliver.repository.ProductRespository;




@Service
public class ProductService {
	
	@Autowired
	private ProductRespository repository;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

}

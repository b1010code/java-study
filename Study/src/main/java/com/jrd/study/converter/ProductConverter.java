package com.jrd.study.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.jrd.study.dto.ProductDto;
import com.jrd.study.model.Product;

@Component
public class ProductConverter {
	public ProductDto entityToDto(Product product) {

		ModelMapper mapper = new ModelMapper();
		ProductDto map = mapper.map(product, ProductDto.class);
		return map;
	}

	public List<ProductDto> entityToDto(List<Product> product) {

		return product.stream().map(x -> entityToDto(x)).collect(Collectors.toList());

	}

	public Product dtoToEntity(ProductDto dto) {

		ModelMapper mapper = new ModelMapper();
		Product map = mapper.map(dto, Product.class);
		return map;
	}

	public List<Product> dtoToEntity(List<ProductDto> dto) {

		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
}

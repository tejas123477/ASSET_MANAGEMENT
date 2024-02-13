package com.hexaware.ITasset1.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.ITasset1.entity.Category;
import com.hexaware.ITasset1.repository.CategoryRepository;
import com.hexaware.ITasset1.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		Category c=categoryRepo.save(category);
		return c;
	}

}

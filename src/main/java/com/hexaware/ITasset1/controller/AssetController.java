package com.hexaware.ITasset1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.ITasset1.DTO.CategoryandAssetDTO;
import com.hexaware.ITasset1.entity.Asset;
import com.hexaware.ITasset1.entity.Category;
import com.hexaware.ITasset1.entity.Category.type;
import com.hexaware.ITasset1.service.AssetService;
import com.hexaware.ITasset1.service.CategoryService;

@RestController
public class AssetController {

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private AssetService assetService;
	
	@PostMapping("/saveAsset")
	public Asset addAsset(@RequestBody CategoryandAssetDTO categoryandassetdto)
	{
		Asset asset=categoryandassetdto.getAsset();	
		Category category=categoryandassetdto.getCategory();
		Category savedCategory=categoryService.addCategory(category);
		asset.setCategory(savedCategory);
		return assetService.addAssets(asset);
	}
	
	
}

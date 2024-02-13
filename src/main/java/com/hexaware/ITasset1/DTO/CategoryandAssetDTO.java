package com.hexaware.ITasset1.DTO;

import com.hexaware.ITasset1.entity.Asset;
import com.hexaware.ITasset1.entity.Category;

public class CategoryandAssetDTO {

	private Category category;
	
	private Asset asset;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public CategoryandAssetDTO(Category category, Asset asset) {
		super();
		this.category = category;
		this.asset = asset;
	}

	@Override
	public String toString() {
		return "CategoryandAssetDTO [category=" + category + ", asset=" + asset + "]";
	}

	public CategoryandAssetDTO() {
		super();
	}
	
	
}

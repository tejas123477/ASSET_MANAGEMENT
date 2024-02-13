package com.hexaware.ITasset1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="asset")
public class Asset {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="asset_id")
	private Long assetId;
	
	@Column(name="model")
	private String model;
	
	@Column(name="description")
	private String description;
	
	@Column(name="name")
	private String image;
	
	@ManyToOne
	@JoinColumn(name="category_id", referencedColumnName="category_id")
	private Category category;

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Asset(Long assetId, String model, String description, String image, Category category) {
		super();
		this.assetId = assetId;
		this.model = model;
		this.description = description;
		this.image = image;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", model=" + model + ", description=" + description + ", image=" + image
				+ ", category=" + category + "]";
	}

	public Asset() {
		super();
	}
	
	
}

package com.hexaware.ITasset1.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.ITasset1.entity.Asset;
import com.hexaware.ITasset1.repository.AssetRepository;
import com.hexaware.ITasset1.service.AssetService;

@Service
public class AssetServiceImpl implements AssetService {

	@Autowired
	private AssetRepository assetRepository;
	
	
	@Override
	public Asset addAssets(Asset asset) {
		// TODO Auto-generated method stub
		Asset a=assetRepository.save(asset);
		return a;
	}

}

package com.firsttryingprojcet1.Service;

import java.util.List;
import java.util.Map;

import com.firsttryingprojcet1.model.Address;

public interface AddressService {

	public Map<String,Object> saveAddress(Address address);
	
	public List<Address> getAllAddress();
	
	public Map<String,Object> getAddressById(Long id);
	
	public Map<String,Object> updateAddressDetails(Address address,Long id);
	
	public void deleteAddress(Long id);

	
	
}

package com.firsttryingprojcet1.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.firsttryingprojcet1.Service.AddressService;
import com.firsttryingprojcet1.model.Address;
import com.firsttryingprojcet1.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository addressRepository;

	@Override
	public Map<String, Object> saveAddress(Address address) {
		Address existingAddress = addressRepository.save(address);
		Map<String, Object> map = new HashMap<>();
		if (existingAddress != null) {
			map.put("msg", "Address added");
			map.put("Address", existingAddress.getId());
		}
		return map;
		

}

	@Override
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}

	@Override
	public Map<String, Object> getAddressById(Long id) {
	   Address add = addressRepository.findById(id).get();
	   Map<String,Object> map = new HashMap<>();
	   map.put("addressLine1", add.getAddressLine1());
	   map.put("addressLine2", add.getAddressLine2() );
	   map.put("city",add.getCity() );
	   map.put("state",add.getState());
	   map.put("pincode",add.getPincode() );
		return map;
	}

	@Override
	public Map<String, Object> updateAddressDetails(Address address, Long id) {
		Address add = addressRepository.findById(id).get();
		Map<String, Object> map = new HashMap<>();
		if (add != null) {
			if (address.getAddressLine1() != null)
				add.setAddressLine1(address.getAddressLine1());
			if (address.getAddressLine2() != null)
				add.setAddressLine2(address.getAddressLine2());
			if (address.getCity() != null)
				add.setCity(address.getCity());
			if (address.getState() != null)
				add.setState(address.getState());
			if (address.getPincode() != null)
				add.setPincode(address.getPincode());
			addressRepository.save(add);
			map.put("message", "address details updated successfully");

		}

		return map;
	}

	@Override
	public void deleteAddress(Long id) {
		addressRepository.findById(id);
		addressRepository.deleteById(id);
		
	}

}

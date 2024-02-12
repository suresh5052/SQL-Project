package com.firsttryingprojcet1;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.firsttryingprojcet1.model.Address;
import com.firsttryingprojcet1.repository.AddressRepository;

public class AddressRepositoryTesting {

	@Autowired
	AddressRepository addressrepository;

	@Test
	public void saveaddress() {

		Address address = Address.builder()
				.addressLine1("5-1-11/1")
				.addressLine2("near kiran hospital")
				.city("bangalore")
				.state("karnataka")
				.pincode("516227")
				.build();
		addressrepository.save(address);

		Assertions.assertThat(address.getId()).isGreaterThan(0);

	}
}

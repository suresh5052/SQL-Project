package com.firsttryingprojcet1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firsttryingprojcet1.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

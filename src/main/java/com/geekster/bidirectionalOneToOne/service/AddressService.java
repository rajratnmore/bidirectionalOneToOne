package com.geekster.bidirectionalOneToOne.service;

import com.geekster.bidirectionalOneToOne.model.Address;
import com.geekster.bidirectionalOneToOne.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "address added";
    }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }
}

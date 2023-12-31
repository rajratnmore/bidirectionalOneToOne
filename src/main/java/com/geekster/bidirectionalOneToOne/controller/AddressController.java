package com.geekster.bidirectionalOneToOne.controller;

import com.geekster.bidirectionalOneToOne.model.Address;
import com.geekster.bidirectionalOneToOne.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("address")
    public List<Address> getAddresses(){
        return addressService.getAddress();
    }

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.addAddress(newAddress);
    }
}

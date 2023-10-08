package com.geekster.bidirectionalOneToOne.repo;

import com.geekster.bidirectionalOneToOne.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}

package com.geekster.bidirectionalOneToOne.repo;

import com.geekster.bidirectionalOneToOne.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpRepo extends JpaRepository<Emp, Integer> {
}

package com.nayancouto.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nayancouto.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

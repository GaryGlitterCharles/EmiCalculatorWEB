package com.emi.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.emi.pkg.domain.Result;

@Repository
public interface EmiRepository extends JpaRepository<Result, Integer>
{
	
}

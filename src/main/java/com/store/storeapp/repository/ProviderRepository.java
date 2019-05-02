package com.store.storeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.storeapp.models.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long>{

}

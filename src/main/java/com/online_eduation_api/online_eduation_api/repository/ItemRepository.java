package com.online_gateway_api.online_gateway_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online_gateway_api.online_gateway_api.repository.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}

package com.sts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.entity.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
}

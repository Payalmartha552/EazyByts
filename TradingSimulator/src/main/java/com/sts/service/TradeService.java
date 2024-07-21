package com.sts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.entity.Trade;
import com.sts.repository.TradeRepository;

@Service
public class TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    public List<Trade> getAllTrades() {
        return tradeRepository.findAll();
    }

    public Trade createTrade(Trade trade) {
        return tradeRepository.save(trade);
    }
}

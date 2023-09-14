package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class TransferMoneyService {
    public double sumUSD(double usd) {
        return usd * 23000;
    }
}

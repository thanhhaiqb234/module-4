package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class SpiceService implements ISpiceService{
    @Override
    public String[] checkSpice(String[] spices) {
        String[] spicess = new String[spices.length];
        for (int i = 0; i < spices.length; i++) {
            spicess[i] = spices[i];
        }
        return spicess;
    }
}

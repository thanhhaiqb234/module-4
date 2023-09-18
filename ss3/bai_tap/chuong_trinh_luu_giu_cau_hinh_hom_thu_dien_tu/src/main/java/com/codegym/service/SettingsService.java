package com.codegym.service;

import com.codegym.model.Settings;
import com.codegym.repository.ISettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SettingsService implements ISettingsService{

    @Autowired
    private ISettingsRepository settingsRepository;


    @Override
    public List<Settings> showMail() {
        return settingsRepository.showMail();
    }

    @Override
    public List<Settings> search(int id) {
        return settingsRepository.search( id);
    }

    @Override
    public List<String> showLanguages() {
        return settingsRepository.showLanguages();
    }

    @Override
    public List<Integer> showPageSize() {
        return settingsRepository.showPageSize();
    }
}

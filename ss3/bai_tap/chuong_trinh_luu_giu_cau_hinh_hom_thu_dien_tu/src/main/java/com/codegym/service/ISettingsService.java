package com.codegym.service;

import com.codegym.model.Settings;

import java.util.List;

public interface ISettingsService {
    List<Settings> showMail();
    List<Settings> search(int id);

    List<String> showLanguages();

    List<Integer> showPageSize();
}

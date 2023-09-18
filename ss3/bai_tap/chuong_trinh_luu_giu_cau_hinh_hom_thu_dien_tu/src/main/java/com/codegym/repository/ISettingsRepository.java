package com.codegym.repository;

import com.codegym.model.Settings;

import java.util.List;

public interface ISettingsRepository {
    List<Settings> showMail();

    List<Settings> search(int id);


    List<String> showLanguages();

    List<Integer> showPageSize();
}

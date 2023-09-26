package com.codegym.repository;

import com.codegym.model.Settings;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SettingsRepository implements ISettingsRepository{
    private static List<String> stringList = new ArrayList<>();
    private static List<Integer> integerList = new ArrayList<>();
    private static List<Settings> settingsList = new ArrayList<>();

    static {
        settingsList.add(new Settings(1,"Vietnamese",5,true,"King,Asgard"));

        stringList.add("English");
        stringList.add("Vietnamese");
        stringList.add("Japanese");
        stringList.add("Chinese");


        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);
        integerList.add(25);
    }

    @Override
    public List<Settings> showMail() {
        return settingsList;
    }

    @Override
    public List<Settings> search(int id) {
        List<Settings> settingsList1 = new ArrayList<>();
        for (int i = 0; i < settingsList.size(); i++) {
            if (settingsList.get(i).getId() == id){
                settingsList1.add(settingsList.get(i));
            }
        }
        return settingsList1;
    }

    @Override
    public List<String> showLanguages() {
        return stringList;
    }

    @Override
    public List<Integer> showPageSize() {
        return integerList;
    }
}

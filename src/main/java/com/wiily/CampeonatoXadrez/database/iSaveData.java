package com.wiily.CampeonatoXadrez.database;

import java.util.List;

public interface iSaveData {
    <T> void saveData(String path, T object);
    <T> void saveData(String path, List<T> object);
}


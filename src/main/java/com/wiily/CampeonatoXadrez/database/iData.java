package com.wiily.CampeonatoXadrez.database;

import java.io.IOException;
import java.util.List;

public interface iData {
    <T> void saveData(String path, T object);
    <T> void createDataDir();
}


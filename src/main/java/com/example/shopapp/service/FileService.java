package com.example.shopapp.service;

import java.io.File;

public interface FileService {

    boolean saveToFile(String json);

    String readFromFile();

    File getDataFile();

    boolean cleanDataFile();
}

package com.example.shopapp.service;

import com.example.shopapp.exception.InvalidSockException;
import com.example.shopapp.model.Colour;
import com.example.shopapp.model.Socks;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public abstract interface ShopService {

    final TreeMap<Integer, Socks> socksMap = new TreeMap<>();

    Socks addSocks(Socks socks);

    Socks editSocks(int id, Socks socks);

    boolean deleteById(int id);
}

package com.example.urlhitcounter.service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    private int hitCount = 0;

    public int getHitCount() {
        return ++hitCount;
    }
}

package com.szdy.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Start implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello world!");
    }
}

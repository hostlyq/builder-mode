package com.net.second.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daidaijie on 2016/1/26.
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n产品 创建——————————");
        for (String part : parts
                ) {
            System.out.println(part);
        }
    }
}

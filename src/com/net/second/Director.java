package com.net.second;

import com.net.second.builder.Builder;

/**
 * Created by daidaijie on 2016/1/26.
 */
public class Director {
    public void construct(Builder builder){
        builder.builderPartA();
        builder.builderPartB();
    }
}

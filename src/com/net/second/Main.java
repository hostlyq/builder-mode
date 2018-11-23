package com.net.second;

import com.net.second.builder.Builder;
import com.net.second.builder.ConcreteBuilder1;
import com.net.second.builder.ConcreteBuilder2;
import com.net.second.builder.Product;

/**
 * Created by daidaijie on 2016/1/26.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product p1 = builder1.getResult();
        p1.show();

        director.construct(builder2);
        Product p2 = builder1.getResult();
        p2.show();
    }
}

package com.net.second.builder;

/**
 * Created by daidaijie on 2016/1/26.
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.add("部件A");
    }

    @Override
    public void builderPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

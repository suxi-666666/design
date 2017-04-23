package com.learn.design.builder;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/14 0014
 * Time: 12:10
 *
 * @author Administrator
 * @version 1.0
 */
public class BuildDog implements IBuildAnimalToy {

    private Product product = new Product();

    @Override
    public void head() {
        product.add("dog head");
    }

    @Override
    public void body() {
        product.add("dog body");
    }

    @Override
    public void foot() {
        product.add("dog foot");
    }

    @Override
    public Product getProduct() {
        return product;
    }

}

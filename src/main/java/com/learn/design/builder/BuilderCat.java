package com.learn.design.builder;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/14 0014
 * Time: 11:49
 *
 * @author Administrator
 * @version 1.0
 */
public class BuilderCat implements IBuildAnimalToy {

    private Product product = new Product();

    @Override
    public void head() {
        product.add("cat head");
    }

    @Override
    public void body() {
        product.add("cat body");
    }

    @Override
    public void foot() {
        product.add("cat foot");
    }

    @Override
    public Product getProduct() {
        return product;
    }

}

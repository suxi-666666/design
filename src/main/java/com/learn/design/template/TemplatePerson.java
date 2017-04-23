package com.learn.design.template;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/12 0012
 * Time: 20:47
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class TemplatePerson {

    public void doSth(){
        run();
        eat();
        learn();
    }

    protected abstract void run();
    protected abstract void eat();
    protected abstract void learn();

}

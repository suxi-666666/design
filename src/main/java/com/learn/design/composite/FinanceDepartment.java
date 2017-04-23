package com.learn.design.composite;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/22 0022
 * Time: 22:26
 *
 * @author Administrator
 * @version 1.0
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < depth; i ++) {
            s.append("-");
        }
        System.out.println(s.toString() + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.format("%s 公司财务收支管理\n", name);
    }

}

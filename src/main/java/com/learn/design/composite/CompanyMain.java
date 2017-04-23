package com.learn.design.composite;

import com.learn.design.decorate.ConcreateComponent;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/22 0022
 * Time: 22:27
 *
 * @author Administrator
 * @version 1.0
 */
public class CompanyMain {

    public static void main(String[] args) {

        CompanyConcrete concrete = new CompanyConcrete("上海总公司");
        concrete.add(new HRDepartment("总公司人力资源部"));
        concrete.add(new FinanceDepartment("总公司财务部"));


        CompanyConcrete conc = new CompanyConcrete("湖北办事处");
        conc.add(new HRDepartment("华中办事处人力资源部"));
        conc.add(new FinanceDepartment("华中办事处财务部"));

        concrete.add(conc);

        CompanyConcrete c = new CompanyConcrete("杭州办事处");
        c.add(new HRDepartment("杭州办事处人力资源部"));
        c.add(new FinanceDepartment("杭州办事处财务部"));

        concrete.add(c);

        System.out.println("结构图: ");
        concrete.display(1);

        System.out.println("职责: ");
        concrete.lineOfDuty();

    }

}

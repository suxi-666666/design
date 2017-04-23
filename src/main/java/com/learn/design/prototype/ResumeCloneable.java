package com.learn.design.prototype;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/11 0011
 * Time: 21:02
 *
 * @author Administrator
 * @version 1.0
 */
public class ResumeCloneable implements ICloneable {

    private String name;
    private String sex;
    private Integer age;

    private WorkCloneable workCloneable;

    public ResumeCloneable(String name) {
        this.name = name;
        workCloneable = new WorkCloneable();
    }

    public ResumeCloneable(WorkCloneable workCloneable) {
        this.workCloneable = (WorkCloneable) workCloneable.clone();
    }

    public void setPersonalInfo(String sex, Integer age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWrokInfo(String workDate, String company) {
        workCloneable.setWorkDate(workDate);
        workCloneable.setCompany(company);
    }

    public void display() {
        System.out.format("个人信息: %s %s %s \n", name, sex, age);
        System.out.format("工作经历: %s %s \n", workCloneable.getWorkDate(), workCloneable.getCompany());
    }

    @Override
    public Object clone() {
        ResumeCloneable resumeCloneable = new ResumeCloneable(this.workCloneable);
        resumeCloneable.setName(this.name);
        resumeCloneable.setSex(this.sex);
        resumeCloneable.setAge(this.age);
        return resumeCloneable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

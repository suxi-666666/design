package com.learn.design.prototype;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/11 0011
 * Time: 21:21
 *
 * @author Administrator
 * @version 1.0
 */
public class PrototypeMain {

    public static void main(String[] args) {

        ResumeCloneable cloneable = new ResumeCloneable("suxi");
        cloneable.setPersonalInfo("男", 22);
        cloneable.setWrokInfo("2016-01-19", "上海南相科技有限公司");

        cloneable.display();

        ResumeCloneable resumeCloneable = (ResumeCloneable) cloneable.clone();
        resumeCloneable.setWrokInfo("2016-06-06", "佳依佳信息科技有限公司");

        resumeCloneable.display();

    }

}

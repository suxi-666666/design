package com.learn.design.state;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/17 0017
 * Time: 20:51
 *
 * @author Administrator
 * @version 1.0
 */
public class Work {

    private State state;
    private Integer hours;
    private Boolean finish;

    public Work() {
        state = new StateMorning();
    }

    public void program() {
        state.program(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }
}

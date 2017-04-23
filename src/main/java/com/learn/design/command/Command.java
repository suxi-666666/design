package com.learn.design.command;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/27 0027
 * Time: 21:19
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute();

}

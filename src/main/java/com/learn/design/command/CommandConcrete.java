package com.learn.design.command;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/27 0027
 * Time: 21:22
 *
 * @author Administrator
 * @version 1.0
 */
public class CommandConcrete extends Command {

    public CommandConcrete(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        receiver.action();
    }

}

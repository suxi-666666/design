package com.learn.design.command;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/1/27 0027
 * Time: 21:28
 *
 * @author Administrator
 * @version 1.0
 */
public class CommandMain {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new CommandConcrete(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();

    }

}

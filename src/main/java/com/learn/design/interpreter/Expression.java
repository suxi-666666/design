package com.learn.design.interpreter;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 13:32
 *
 * @author Administrator
 * @version 1.0
 */
public abstract class Expression {

    public void interpret(ContextPlay contextPlay) {
        if (contextPlay == null && contextPlay.getContext().length() == 0) {
            return;
        } else {
            String key = contextPlay.getContext().substring(0, 1);
            contextPlay.setContext(contextPlay.getContext().substring(2));


            Double value = Double.parseDouble(contextPlay.getContext().split(" ")[0]);
            contextPlay.setContext(contextPlay.getContext().substring(contextPlay.getContext().indexOf(" ") + 1));

            excute(key, value);
        }
    }

    abstract void excute(String key, Double value);

}

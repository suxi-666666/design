package com.learn.design.interpreter;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 13:47
 *
 * @author Administrator
 * @version 1.0
 */
public class InterpreterMain {

    public static void main(String[] args) {

        ContextPlay context = new ContextPlay();

        System.out.println("上海滩: ");

        context.setContext("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");

        Expression expression = null;
        while (context.getContext().length() > 0) {
            String string = context.getContext().substring(0, 1);
            switch (string) {
                case "O":
                    expression = new ExpressionScale();
                    break;
                case "T":
                    expression = new ExpressionSpeed();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new ExpressionNote();
                    break;
            }
            if (expression != null) {
                expression.interpret(context);
            } else {
                context.setContext("");
                try {
                    throw new Exception("上下文格式不合法.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

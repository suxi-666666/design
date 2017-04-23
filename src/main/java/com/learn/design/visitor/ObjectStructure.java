package com.learn.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@Title: IntelliJ IDEA.</p>
 * Description:
 * Date: 2017/2/2 0002
 * Time: 14:20
 *
 * @author Administrator
 * @version 1.0
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<Element>();

    public void add(Element element) {
        elements.add(element);
    }

    public boolean remove(Element element) {
        return elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }

}

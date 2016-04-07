package com.isatimur;

/**
 * Created by tisachenko on 01.04.16.
 */

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class SecondPage extends BasePage {
    private static final long serialVersionUID = 1L;

    public SecondPage(final PageParameters parameters, String value) {
        super(null);
        System.out.println("VAL:" + value);
        add(new Label("valuepassed", value));

    }
}

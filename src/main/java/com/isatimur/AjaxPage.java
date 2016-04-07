package com.isatimur;

/**
 * Created by tisachenko on 01.04.16.
 */

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class AjaxPage extends BasePage {
    private static final long serialVersionUID = 1L;
    private int counter = 0;
    private Label label;

    public AjaxPage(final PageParameters parameters) {
        super(null);
        add(new AjaxFallbackLink("link") {

            @Override
            public void onClick(AjaxRequestTarget target) {
                counter++;
                if (target != null) target.add(label);
            }
        });
        label = new Label("label", new PropertyModel<>(this, "counter"));
        label.setOutputMarkupId(true);
        add(label);

    }
}

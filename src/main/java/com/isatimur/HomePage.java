package com.isatimur;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends BasePage {
    private static final long serialVersionUID = 1L;
    String inputValue;
    private int counter = 0;

    @SuppressWarnings("serial")
    public HomePage(final PageParameters parameters) {
        super(null);
        this.inputValue = "test";
        Form<String> form = new Form<String>("form") {
            @Override
            protected void onSubmit() {
                setResponsePage(new SecondPage(null, inputValue));
            }
        };
        add(form);
        form.add(new TextField<String>("input", new PropertyModel<String>(this, "inputValue")));
        add(new Link("link") {

            @Override
            public void onClick() {
                counter++;
            }
        });
        add(new Label("label", new PropertyModel(this, "counter")));

        add(new Link("link_new") {

            @Override
            public void onClick() {
                setResponsePage(new AjaxPage(null));
            }
        });

        add(new Link("link_new_echo") {

            @Override
            public void onClick() {
                setResponsePage(new EchoPage(null));
            }
        });


    }
}

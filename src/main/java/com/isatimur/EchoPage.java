package com.isatimur;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

/**
 * Created by tisachenko on 06.04.16.
 */
public class EchoPage extends BasePage {
    private int counter = 0;
    private Label label;

    public EchoPage(Object o) {
        super(null);
        TextField<String> textField = new TextField<>("field", new Model<String>(""));

        Form<String> form = new Form<String>("form");
        form.add(textField);
        form.add(new Button("button") {
            @Override
            public void onSubmit() {
                String value = textField.getModelObject();
                label.setDefaultModelObject(label.getDefaultModelObject() + "\n" + value);
                textField.setModelObject("");
            }
        });
        add(form);
        add(label = new Label("message", new Model<String>("")));

    }
}

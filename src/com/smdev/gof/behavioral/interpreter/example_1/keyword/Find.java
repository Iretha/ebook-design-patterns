package com.smdev.gof.behavioral.interpreter.example_1.keyword;


import com.smdev.gof.behavioral.interpreter.example_1.AbstractExpressionNonTerminal;
import com.smdev.gof.behavioral.interpreter.example_1.Context;
import com.smdev.gof.behavioral.interpreter.example_1.Dog;

import java.util.List;

public class Find extends AbstractExpressionNonTerminal {

    private String arg;

    public Find(Context context) {
        super(context);
    }

    @Override
    public void parse() {
        this.arg = getContext().getArgs().pollFirst();
    }

    @Override
    public List<Dog> evaluate() {
        List<Dog> list = getContext().getDatabase().get(this.arg);
        if(list != null){
            getContext().getData().addAll(list);
        }
        return getContext().getData();
    }
}
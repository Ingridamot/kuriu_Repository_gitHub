package com.motuziene.uzduotis1;

import java.util.function.Function;

public class InjectableTranslator implements Function<String, String> {
    private final Translator translator = new Translator();
    @Override
    public String apply(String key) {
        return translator.toLocal(key);
    }
}

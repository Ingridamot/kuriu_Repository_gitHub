package com.motuziene.uzduotis1;

public class SpeechEngine {
    private final InjectableTranslator translator;

    public SpeechEngine(InjectableTranslator translator) {
        this.translator = translator;
    }

    public String speak(String key){
      return translator.andThen(String::toUpperCase).apply(key);
    }
}

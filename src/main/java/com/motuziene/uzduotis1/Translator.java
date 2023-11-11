package com.motuziene.uzduotis1;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    static Map<String, String> translations = new HashMap<String, String >();
    public Translator(){
        translations.put("hello","Welcom to our app");
        translations.put("entry_added","Entry has been added");
        translations.put("logout", "Logout");
    }

    public String toLocal(String key){
        return translations.get(key);
    }
}

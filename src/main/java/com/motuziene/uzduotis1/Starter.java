package com.motuziene.uzduotis1;

@FunctionalInterface
public interface Starter {
    String start(String startupName,String founderName);

    default void progress(){
        System.out.println("in progress");
    }

    static String finish(){
        return "Startup sold";
    }
}

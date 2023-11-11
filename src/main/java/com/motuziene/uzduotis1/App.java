package com.motuziene.uzduotis1;

public class App {
    public static void main(String[] args) {

//        Startup startup = new Startup(); // Inicelizuoju startup klase
//
//        String startupInfo = startup.start("My Startup", "Fiesta");
//        System.out.println("Startup info: " + startupInfo);
//
//        startup.progress();
//
//        String result = Starter.finish();
//        System.out.println("Finish result: " + result);

//        Starter starter = (startupName, founderName) -> {  // Anonimine klase
//            String result = startupName + " - " + founderName;
//            return result;
//        };


//       Starter starter = (startupName, founderName) -> startupName + " - " + founderName;
//
//        String startupInfo = starter.start("My Startup", "Fiesta");
//        System.out.println("Startup info: " + startupInfo);
//
//        starter.progress();
//
//        String result = Starter.finish();
//        System.out.println("Finish result: " + result);

        InjectableTranslator injectableTranslator = new InjectableTranslator();

        SpeechEngine speechEngine = new SpeechEngine(injectableTranslator);

        System.out.println(speechEngine.speak("hello"));
    }
}

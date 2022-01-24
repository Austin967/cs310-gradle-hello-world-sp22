package keywords;

import edu.jsu.mcis.*;

public class CustomKeywords {
    
    private HelloWorld helloWorld;
    
    public CustomKeywords() {
        helloWorld = new HelloWorld();
    }
    
    public String greetEveryone() {
        return helloWorld.showIt();
    }
    
    public String reverseGreetEveryone() {
        return helloWorld.reverseIt();
    }

}
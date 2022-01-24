package edu.jsu.mcis;

public class HelloWorld {
    
    public String showIt() {
        return "hello world";
    }
    
    public String reverseIt() {
        return "dlrow olleh";
    }
    
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        System.out.println(h.showIt());
        System.out.println(h.reverseIt());
    }

}













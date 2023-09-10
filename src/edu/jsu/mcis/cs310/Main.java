package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        
        String message = m.getGreeting();
        
        System.out.println(message.toString());
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder other = new StringBuilder(message);
        other = other.reverse();
        message = other.toString();
        return message;
    }
    
}
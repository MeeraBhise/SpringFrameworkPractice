package com.Practice;

public class GreetingService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message: " + message);
    }

    @Override
    public String toString() {
        return "GreetingService{" +
                "message='" + message + '\'' +
                '}';
    }
}
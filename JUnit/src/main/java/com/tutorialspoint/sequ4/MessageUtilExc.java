package com.tutorialspoint.sequ4;

public class MessageUtilExc {
    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtilExc(String message){
        this.message = message;
    }

    // prints the message
    public void printMessage(){
        // System.out.println(message);
        int a = 0;
        int b = 1/a;
        System.out.println(message);
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}

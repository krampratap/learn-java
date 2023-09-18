package com.java.advanced.Method_reference;
// refer a constructor by using the new keyword

interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}


public class Mr3_Constructor {
    public static void main(String[] args) {
        Messageable methodReference = Message::new;
        methodReference.getMessage("Hello");
    }
}

package com.company.Command;

public class ShopButton {
    Command command;
    //invoker class
    public ShopButton(Command command) {
        this.command = command;
    }
    public void buttonWasPressed(){
        command.execute();
    }  //setCommand
}

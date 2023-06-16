package ru.softwareTesting.mobile;

public class MainClass {
    public static final int MAGIC_NUMBER = 14;
    private int class_number = 20;
    private String class_string = "Hello, world";

    public int getLocalNumber(){
        return MAGIC_NUMBER;
    }

    public int getClassNumber(){
        return class_number;
    }

    public String getClassString(){ return class_string;}
}

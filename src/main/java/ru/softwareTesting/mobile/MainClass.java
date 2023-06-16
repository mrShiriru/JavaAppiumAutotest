package ru.softwareTesting.mobile;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {
    public static final int MAGIC_NUMBER = 14;
    private int class_number = 20;


    public int getLocalNumber(){
        return MAGIC_NUMBER;
    }

    public int getClassNumber(){
        return class_number;
    }

}

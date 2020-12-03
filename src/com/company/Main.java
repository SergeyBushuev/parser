package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here TODO
    }
    public String parser(String str) {
        String mask = "Pipis pten4ik porter";

        Pattern adressS = Pattern.compile("^0x[\\da-f]{10}:"); //Поиск адреса из начала строки, последнее что нужно
        Pattern commandCheck = Pattern.compile("(\\bj[a-z]+)|(\\bcall[a-z]+)\\s+[^0]+");
        return "";
    }
}

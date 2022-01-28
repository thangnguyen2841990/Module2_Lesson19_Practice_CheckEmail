package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String REGEX_EMAIL = "^\\w+@\\w+(\\.\\w+){1,2}$";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        checkEmail(email);
        //nhập đúng trả về true, sai trả về false
    }

    private static void checkEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
    }
}

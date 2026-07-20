package com.java;

import java.util.Scanner;

import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        class1 ob=new class1();
        int n=input.nextInt();
        ob.n=n;
        ob.get();


    }

}

class Greeter {
    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}


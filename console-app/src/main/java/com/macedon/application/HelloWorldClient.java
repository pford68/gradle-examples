package com.macedon.application;


import com.macedon.core.HelloWorld;

/**
 * Created by paford on 1/4/16.
 */
public class HelloWorldClient {

    private HelloWorld helloWorld;

    public static void main(String[] args){
        new HelloWorldClient().helloWorld.greet();
    }
}

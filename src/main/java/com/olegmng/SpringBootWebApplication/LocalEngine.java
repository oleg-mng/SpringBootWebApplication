package com.olegmng.SpringBootWebApplication;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class LocalEngine implements Engine {
    public LocalEngine() {

        System.out.println("Engine start on my laptop");
    }
    public void go(){
        System.out.println("Go slowly!");
    }
}

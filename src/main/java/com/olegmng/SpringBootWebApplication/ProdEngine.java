
package com.olegmng.SpringBootWebApplication;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdEngine implements Engine {
    public ProdEngine() {

        System.out.println("Engine start on server");
    }
    public void go(){
        System.out.println("Go fast!");
    }
}

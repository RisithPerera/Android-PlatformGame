package com.risith.pgame;

/**
 * Created by RISITH-PC on 2018-02-24.
 */

public class BasicDesign extends Thread{
    public BasicDesign(Runnable target) {
        super(target);
    }

    public void newThread(){
        System.out.println("H");
    }
}

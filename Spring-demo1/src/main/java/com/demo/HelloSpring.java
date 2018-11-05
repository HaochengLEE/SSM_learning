package com.demo;

/**
 * @author lihaocheng
 * @create 2018-11-05 下午9:51
 **/

public class HelloSpring {
    private String who=null;

    public void print(){
        System.out.println("hello"+this.getWho()+"!");
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
}

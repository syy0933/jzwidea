package com.itheima.pojo;

/**
 * 包名:com.itheima.pojo
 * 作者:金智伟
 * 日期2019-10-12  23:49
 */
public class User {
    private  String  username1;
    private  Integer id;//用户id////////
    private  Integer sid;//用户id////////
    private  Integer tid;//用户id////////
    private int idt;

    public static void main(String[] args) {

    }
    private int  ids;
    private int  ir;
    private int  irs1;


    int j;





    public User(String username1) {
        this.username1 = username1;
    }

    public User(String username1, Integer id, Integer sid, Integer tid, int idt) {
        this.username1 = username1;
        this.id = id;
        this.sid = sid;
        this.tid = tid;
        this.idt = idt;
    }

    public String getUsername1() {
        return username1;
    }
}
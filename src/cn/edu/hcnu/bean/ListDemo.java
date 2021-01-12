package cn.edu.hcnu.bean;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("张红");
        list.add("河池学院");
        list.add("大二");
        for (Object i:list){
            System.out.println(i);
        }

    }
}

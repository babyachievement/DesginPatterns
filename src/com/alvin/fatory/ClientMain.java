package com.alvin.fatory;

/**
 * Created by haoqiang on 2015/7/23.
 * ���������ο���
 * http://sishuok.com/forum/blogPost/list/86.html
 */
public class ClientMain {
    public static void main(String[] args) {
        ExportOperate operate = new ExportTxtFileOperate();
        operate.export("Hello world");
    }
}
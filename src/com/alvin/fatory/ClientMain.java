package com.alvin.fatory;

/**
 * Created by babyachievement on 2015/7/23.
 * 参考自
 * http://sishuok.com/forum/blogPost/list/86.html
 */
public class ClientMain {
    public static void main(String[] args) {
        ExportOperate operate = new ExportTxtFileOperate();
        operate.export("Hello world");
    }
}

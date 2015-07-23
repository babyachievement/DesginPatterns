package com.alvin.fatory;

/**
 * Created by haoqiang on 2015/7/23.
 */
public class ExportTxtFieApi implements ExportDataApi{
    @Override
    public boolean export(String data) {
        System.out.println("Export " + data +" txt file successfully");
        return true;
    }
}

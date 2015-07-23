package com.alvin.fatory;

/**
 * Created by haoqiang on 2015/7/23.
 */
public class ExportDbDataFile implements  ExportDataApi{
    @Override
    public boolean export(String data) {
        System.out.println("Export "+data + " db data to file");
        return true;
    }
}

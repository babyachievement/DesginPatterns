package com.alvin.fatory;

/**
 * Created by haoqiang on 2015/7/23.
 */
public class ExportTxtFileOperate extends ExportOperate {
    @Override
    protected ExportDataApi factoryApi() {
        return new ExportTxtFieApi();
    }
}

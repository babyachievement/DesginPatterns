package com.alvin.fatory;

/**
 * Created by babyachievement on 2015/7/23.
 */
public abstract class ExportOperate {
    public  void export(String data)
    {
        ExportDataApi api = factoryApi();
        api.export(data);
    }

    /**
     * @return
     */
    protected abstract ExportDataApi factoryApi();
}

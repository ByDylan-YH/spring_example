package com.bilibili.f_config_xml.collection;

import java.util.*;

/**
 * Author:BY
 * Date:2020/3/15
 * Description:
 */
class CollectionData {
    private String[] arrayData;
    private List<String> listData;
    private Set<String> setData;
    private Map<String,String> mapData;
    private Properties propData;

    public String[] getArrayData() {
        return arrayData;
    }

    public void setArrayData(String[] arrayData) {
        this.arrayData = arrayData;
    }

    public List<String> getListData() {
        return listData;
    }

    public void setListData(List<String> listData) {
        this.listData = listData;
    }

    public Set<String> getSetData() {
        return setData;
    }

    public void setSetData(Set<String> setData) {
        this.setData = setData;
    }

    public Map<String, String> getMapData() {
        return mapData;
    }

    public void setMapData(Map<String, String> mapData) {
        this.mapData = mapData;
    }

    public Properties getPropData() {
        return propData;
    }

    public void setPropData(Properties propData) {
        this.propData = propData;
    }

    @Override
    public String toString() {
        return "CollectionData{" +
                "arrayData=" + Arrays.toString(arrayData) +
                ", listData=" + listData +
                ", setData=" + setData +
                ", mapData=" + mapData +
                ", propData=" + propData +
                '}';
    }
}

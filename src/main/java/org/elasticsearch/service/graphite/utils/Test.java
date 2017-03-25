package org.elasticsearch.service.graphite.utils;

import com.alibaba.fastjson.JSON;
import org.org.elasticsearch.service.model.Nodes;

/**
 * Created by 835885 on 2016/12/5.
 */
public class Test {
    public static void main(String[] args){
        System.out.println("测试结果");
        String jsonstr=" {         \"timestamp\": 1481009471785,\n" +
                "         \"name\": \"Att-Lass/hot\",\n" +
                "         \"transport_address\": \"10.202.34.209:9303\",\n" +
                "         \"host\": \"10.202.34.209\",\n" +
                "         \"ip\": [\n" +
                "            \"10.202.34.209:9303\",\n" +
                "            \"NONE\"\n" +
                "         ],\n" +
                "         \"attributes\": {\n" +
                "            \"client\": \"true\",\n" +
                "            \"data\": \"false\"\n" +
                "         }}";
        System.out.println(jsonstr);
        fastjson(jsonstr);
    }
    /**
     * 处理json数据
     */
    public static void  fastjson(String jsonstr){
    if(null==jsonstr || ""==jsonstr)
        return;
        Nodes node = JSON.parseObject(jsonstr,Nodes.class);
        System.out.println(node.getName());
        System.out.println(node.getIp().toString());
        System.out.println(node.getAttributes().getClient());
    }

    /**
     *
     * @param url
     * @param uname
     * @param pwd
     */
    public void testSslget(String url,String uname,String pwd){

    }
}

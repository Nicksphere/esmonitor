package org.elastcisearch.service.graphite.main;

import org.ealsticsearch.service.graphite.es.GetData;
import org.elasticsearch.service.graphite.utils.HttpClientUtil;
import org.elasticsearch.service.graphite.utils.Write2Graphite;
import org.org.elasticsearch.service.model.Nodes;

import java.util.List;

/**
 * Created by 835885 on 2016/11/24.
 */
public class MonitorStart {
//    public void run(String clustername,String eshost,String host,int port){
////        System.out.println("carbon数据写入测试");
////        Write2Graphite obj = new Write2Graphite();
////        obj.run();
//        GetData getData = new GetData();
////        getData.getHeapLoad(clustername,eshost);        //写入heap和load
////        getData.getNodeStates(clustername, eshost);           //获取集群节点状态并写入ES
////        getData.getCount(clustername, eshost, host, port);      //获取集群的文档总量
////        getData.getHealth(clustername, eshost, host, port);     //获取集群状态信息
////         getData.write2Graphite(getData.getNodeStates(clustername,eshost),clustername,host,port);   //获取集群节点状态信息
//        String url="https://10.110.77.48:9200/_cat/health?v";
//        String contents= HttpClientUtil.httpsGetrequest(url,"","");
//        System.out.println("SSL ES contents:");
//        System.out.println(contents);
//    }

    /**
     *
     * @param strconfigs
     */
    public void run(String strconfigs){
        if(null==strconfigs||""==strconfigs)return;
        if(!strconfigs.contains("|"))return;
        GetData getData = new GetData();
        String[] configs=strconfigs.split("\\|");
        System.out.println("strconfigs : "+strconfigs);
        //非加密参数为4个
        if(configs.length==4){
//            System.out.println("非加密");
            getData.getCount(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]), null, null);
            getData.getHealth(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]), null, null);
            List<Nodes> list =  getData.getNodeStates(configs[0],configs[1],null,null);
            getData.write2Graphite(list,configs[0],configs[2],Integer.parseInt(configs[3]));
        }
        else if(configs.length==6){
            //加密ES集群
//            System.out.println("加密集群访问");
            getData.getCount(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]),configs[4],configs[5]);
            getData.getHealth(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]),configs[4],configs[5]);
            List<Nodes> list =  getData.getNodeStates(configs[0],configs[1],configs[4],configs[5]);
            getData.write2Graphite(list, configs[0], configs[2], Integer.parseInt(configs[3]));
        }
    }
}

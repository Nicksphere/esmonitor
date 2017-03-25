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
////        System.out.println("carbon����д�����");
////        Write2Graphite obj = new Write2Graphite();
////        obj.run();
//        GetData getData = new GetData();
////        getData.getHeapLoad(clustername,eshost);        //д��heap��load
////        getData.getNodeStates(clustername, eshost);           //��ȡ��Ⱥ�ڵ�״̬��д��ES
////        getData.getCount(clustername, eshost, host, port);      //��ȡ��Ⱥ���ĵ�����
////        getData.getHealth(clustername, eshost, host, port);     //��ȡ��Ⱥ״̬��Ϣ
////         getData.write2Graphite(getData.getNodeStates(clustername,eshost),clustername,host,port);   //��ȡ��Ⱥ�ڵ�״̬��Ϣ
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
        //�Ǽ��ܲ���Ϊ4��
        if(configs.length==4){
//            System.out.println("�Ǽ���");
            getData.getCount(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]), null, null);
            getData.getHealth(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]), null, null);
            List<Nodes> list =  getData.getNodeStates(configs[0],configs[1],null,null);
            getData.write2Graphite(list,configs[0],configs[2],Integer.parseInt(configs[3]));
        }
        else if(configs.length==6){
            //����ES��Ⱥ
//            System.out.println("���ܼ�Ⱥ����");
            getData.getCount(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]),configs[4],configs[5]);
            getData.getHealth(configs[0], configs[1], configs[2], Integer.parseInt(configs[3]),configs[4],configs[5]);
            List<Nodes> list =  getData.getNodeStates(configs[0],configs[1],configs[4],configs[5]);
            getData.write2Graphite(list, configs[0], configs[2], Integer.parseInt(configs[3]));
        }
    }
}

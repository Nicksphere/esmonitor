package org.ealsticsearch.service.graphite.es;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.elasticsearch.service.graphite.utils.Helper;
import org.elasticsearch.service.graphite.utils.HttpClientUtil;
import org.elasticsearch.service.graphite.utils.Write2Graphite;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.org.elasticsearch.service.model.Nodes;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by 835885 on 2016/11/24.
 */
public class GetData {
    private StringBuffer sb = new StringBuffer();
    private String cur ="";
    private String timestamp = Long.toString(System.currentTimeMillis() / 1000);   //д��ʱ���
    public static void main(String[] args){
//        String contents= null;
//        contents = HttpClientUtil.httpGetData("http://10.202.34.201:9200/_cat/nodes");
//        System.out.println(contents);
//        String eshost="http://10.202.34.203:9201/";
//        String clustername="bdp-es-tribe";
//        String host="10.202.34.202";
//        int port =2003;
//        GetData getdata = new GetData();
//        getdata.getHeapLoad(clustername, eshost);
//        getdata.getNodeStates(clustername,eshost);
//        getdata.write2Graphite(getdata.getNodeStates(clustername,eshost),clustername);
//        getdata.getCount(clustername,eshost,host,port);
//        getdata.getHealth(clustername,eshost,host,port,null,null);
    }

    /***
     * ��ȡ��Ⱥ���Ƶ�heap��load
     * @param clustername ��Ⱥ����
     * @param eshost es��ַ
     * @param host carbon��ַ
     * @param port carbon�˿�
     */
    public void getHeapLoad(String clustername,String eshost,String host,int port,String uname,String pwd){
//        Gson gson = new Gson();         //����Json��������
//        gson.fromJson("", Object.class);
        if(null==clustername|| null==eshost) return;
        Write2Graphite wg = new Write2Graphite(host,port);
        String api ="_cat/nodes";
        String contents = getESContents(eshost,api,uname,pwd);
//        System.out.println(contents);
        String[] rows = contents.split("\\n");  //�зֽڵ�����
//        System.out.println(rows.length);
//        System.out.println(rows[0]+" "+rows[1]+" "+rows[2]);
        for(int i=0;i<rows.length;i++){
            //ȥ��������ո�
            String pcolumn = rows[i].replaceAll("\\s+","|");
//            System.out.println(pcolumn);
            String[] colums = pcolumn.trim().split("\\|");
//            System.out.println(colums.length);
            if(Helper.isNumeric(colums[2])){
                StringBuffer sb = new StringBuffer();
//                System.out.println(colums[0]+" "+colums[1]+" "+colums[2]+" "+colums[3]+" "+colums[4]+" "+colums[5]+" ");
                sb.append(clustername+".");
                String ip = colums[0].replaceAll("\\.","_");
                sb.append(ip);
                System.out.println(sb.toString() + "  " + colums[2] + "   "+colums[4]);
//                    wg.sendToGraphite("bdp."+"heapPercent",colums[2]);
//                    wg.sendToGraphite("bdp."+"systemload",colums[4]);
                wg.sendInt(sb.toString(),"heapPercent",Long.parseLong(colums[2]));
                wg.sendFloat(sb.toString(),"systemload",Float.parseFloat(colums[4]));
            }
        }
//        System.out.println(rows.length);
    }

    /**
     * ��ȡ��Ⱥ�ĵ��ĸ���
     * @param clustername ��Ⱥ����
     * @param eshost ��ȺIp
     * @param host carbon��ip
     * @param port carbon�˿�
     */
    public void getCount(String clustername,String eshost,String host,int port,String uname,String pwd){
        if(null==clustername|| null==eshost) return;
        Write2Graphite wg = new Write2Graphite(host,port);
        String api="_cat/count";
        String contents = getESContents(eshost,api,uname,pwd);
//        System.out.println(contents);
        String pcolumn = contents.replaceAll("\\s+","|");
//            System.out.println(pcolumn);
        String[] colums = pcolumn.trim().split("\\|");
        System.out.println(colums[2]);
        wg.sendToGraphite(clustername + ".cluster.count", colums[2]);
    }

    /***
     * ������ȺHealth״̬
     * @param clustername
     * @param eshost
     * @param host
     * @param port
     */
    public void getHealth(String clustername,String eshost,String host,int port,String uname,String pwd){
        if(null==clustername|| null==eshost) return;
        Write2Graphite wg = new Write2Graphite(host,port);
        String api="_cat/health";
        String contents = getESContents(eshost,api,uname,pwd);
        System.out.println(contents);
        String pcolumn = contents.replaceAll("\\s+","|");
////            System.out.println(pcolumn);
        System.out.println(pcolumn);
        String[] colums = pcolumn.trim().split("\\|");
        System.out.println(colums.length);
        if(colums.length<14)return;
        String frontname=clustername+".cluster.";
      wg.sendToGraphite(frontname+"number_of_nodes",colums[4]);
        wg.sendToGraphite(frontname+"number_of_data_nodes",colums[5]);
        wg.sendToGraphite(frontname+"active_primary_shards",colums[6]);
        wg.sendToGraphite(frontname + "active_shards", colums[7]);
        wg.sendToGraphite(frontname + "relocating_shards", colums[8]);
        wg.sendToGraphite(frontname + "initializing_shards", colums[9]);
        wg.sendToGraphite(frontname + "unassigned_shards", colums[10]);
        wg.sendToGraphite(frontname + "number_of_pending_tasks", colums[12]);
        wg.sendToGraphite(frontname+"health_percent",colums[13].replace("%",""));
    }
    /**
     * ��ȡ��Ⱥÿ���ڵ����Ϣ��Ⱥ��ÿ���ڵ����Ϣ
     * @param clustername ��Ⱥ����
     * @param eshost  ��Ⱥ��ַ
     * @return
     */
public   List<Nodes> getNodeStates(String clustername,String eshost,String uname,String pwd){
    List<Nodes> list = new ArrayList<Nodes>();
//    String queryString =eshost+"_nodes/stats";
    String api="_nodes/stats";
    JSONObject jsonContent =null;
//    String contents = HttpClientUtil.httpGetData(queryString);
    String contents=getESContents(eshost,api,uname,pwd);
    System.out.println("Get���󷵻��ַ������ȣ�" + contents.length());
//    System.out.println("���ؽ��:"+contents);
    jsonContent = JSON.parseObject(contents);
//    System.out.println("jsonת�����:"+jsonContent.toJSONString());
    JSONObject nodes = jsonContent.getJSONObject("nodes");
//    System.out.println("nodes���:" + nodes.toJSONString());
    Set<String> set =nodes.keySet();
    System.out.println("nodes����:" + set.size());
    Iterator<String> it = set.iterator();
//    json2keyvalue(nodes);
    while (it.hasNext()){
        String str =it.next();
        System.out.println(str);
        JSONObject node= nodes.getJSONObject(str);
        String nodestr = node.toJSONString();
//        System.out.println(nodestr);
        Nodes nodeinfo = new Nodes();
        nodeinfo = JSON.parseObject(nodestr, Nodes.class);
//        System.out.println(nodeinfo.getName());
//        System.out.println(nodeinfo.getIp().toString());
//        System.out.println(nodeinfo.getAttributes().getData());
//        System.out.println(nodeinfo.getIndices().getMerges().getTotal());
//        System.out.println(nodeinfo.getIndices().getIndexing().getIndex_total());
//        System.out.println(nodeinfo.getProcess().getCpu().getPercent());
//        System.out.println(nodeinfo.getProcess().getMem().getTotal_virtual_in_bytes());
//        System.out.println(nodeinfo.getOs().getCpu_percent());
//        System.out.println(nodeinfo.getOs().getMem().getFree_percent());
//        System.out.println(nodeinfo.getTransport().getServer_open());
// //       System.out.println(nodeinfo.getHttp().getTotal_opened());
//        System.out.println(nodeinfo.getBreakers().getRequest().getLimit_size());
//        System.out.println(nodeinfo.getBreakers().getFielddata().getOverhead());
//        System.out.println(nodeinfo.getBreakers().getParent().getLimit_size());
//        System.out.println(nodeinfo.getScript().getCache_evictions());
//        System.out.println(nodeinfo.getThread_pool().getBulk().getRejected());
//        System.out.println(nodeinfo.getThread_pool().getGeneric().getCompleted());
//        System.out.println(nodeinfo.getJvm().getMem().getHeap_used_percent());
//        System.out.println(nodeinfo.getJvm().getMem().getPools().getYoung().getPeak_used_in_bytes());
//        System.out.println(nodeinfo.getJvm().getThreads().getCount());
//        System.out.println(nodeinfo.getJvm().getGc().getCollectors().getYoung().getCollection_count());
//        System.out.println(nodeinfo.getJvm().getBuffer_pools().getDirect().getCount());
//        System.out.println(nodeinfo.getJvm().getBuffer_pools().getMapped().getTotal_capacity_in_bytes());
//        Object obj =node.get("name");
//        if(node instanceof JSONObject){
//            System.out.println("Json object");
//        }else
//        {
//            System.out.println("String:"+node.toString());
//        }
//        if(node.isEmpty()){
//            System.out.println("Empty");
//        }
//        String name=node.getString("name");
//        System.out.println(name);
//        JSONObject attr = node.getJSONObject("attributes");
//        Set<String> setname= attr.keySet();
//        System.out.println("name size:" + attr.size());
        list.add(nodeinfo);
    }
    return list;
}

    /**
     *���ü�Ⱥ�ڵ������д�뵽Graphite
     * @param list
     * @param clusterName
     */
    public void write2Graphite(List<Nodes> list,String clusterName,String host,int port){
        if(null==list)return;
        Write2Graphite wg = new Write2Graphite(host,port);
        for(int i=0;i<list.size();i++){
            Nodes item = list.get(i);
            //����ÿ���ڵ�Graphiteǰ׺
            String frontName =clusterName+"."+item.getHost().replaceAll("\\.","_")+"."+item.getName();
            System.out.println(frontName);
//            wg.sendToGraphite(frontName + ".indices.docs.deleted", item.);
            //��ʼд��ES��Ⱥ�����Ϣ
            wg.sendToGraphite(frontName+".process.cpu.percent",item.getProcess().getCpu().getPercent());
            wg.sendToGraphite(frontName+".indices.docs.count",item.getIndices().getDocs().getCount());
            wg.sendToGraphite(frontName+".indices.docs.deleted",item.getIndices().getDocs().getDeleted());
            wg.sendToGraphite(frontName+".indices.indexing.index_current",item.getIndices().getIndexing().getIndex_current());
            wg.sendToGraphite(frontName+".indices.search.query_total",item.getIndices().getSearch().getQuery_total());
            wg.sendToGraphite(frontName + ".indices.merges.current_docs", item.getIndices().getMerges().getCurrent_docs());
            wg.sendToGraphite(frontName + ".indices.merges.current_size_in_bytes", parseUnit(item.getIndices().getMerges().getCurrent_size_in_bytes(), "mb"));
            wg.sendToGraphite(frontName + ".indices.query_cache.memory_size_in_bytes", parseUnit(item.getIndices().getQuery_cache().getMemory_size_in_bytes(), "mb"));
            wg.sendToGraphite(frontName + ".indices.query_cache.total_count", item.getIndices().getQuery_cache().getTotal_count());
            wg.sendToGraphite(frontName + ".indices.fielddata.memory_size_in_bytes", parseUnit(item.getIndices().getFielddata().getMemory_size_in_bytes(), "mb"));
            wg.sendToGraphite(frontName + ".indices.segments.count", item.getIndices().getSegments().getCount());
            wg.sendToGraphite(frontName + ".indices.segments.memory_in_bytes", parseUnit(item.getIndices().getSegments().getMemory_in_bytes(), "mb"));
            wg.sendToGraphite(frontName + ".indices.translog.operations", item.getIndices().getTranslog().getOperations());
            wg.sendToGraphite(frontName + ".indices.translog.size_in_bytes", parseUnit(item.getIndices().getTranslog().getSize_in_bytes(), "mb"));
            wg.sendToGraphite(frontName + ".os.load_average", item.getOs().getLoad_average());
            wg.sendToGraphite(frontName + ".os.mem.total_in_bytes", parseUnit(item.getOs().getMem().getTotal_in_bytes(), "gb"));
//            System.out.println("ϵͳ�ڴ�Ϊ��"+parseUnit(item.getOs().getMem().getTotal_in_bytes(), "gb"));
            wg.sendToGraphite(frontName + ".os.mem.used_percent",item.getOs().getMem().getUsed_percent());
            wg.sendToGraphite(frontName + ".jvm.mem.heap_used_in_bytes",parseUnit(item.getJvm().getMem().getHeap_used_in_bytes(), "gb"));
            wg.sendToGraphite(frontName + ".jvm.mem.heap_used_percent",item.getJvm().getMem().getHeap_used_percent());
            wg.sendToGraphite(frontName + ".jvm.mem.pools.young.used_in_bytes",parseUnit(item.getJvm().getMem().getPools().getYoung().getUsed_in_bytes(),"gb"));
            wg.sendToGraphite(frontName + ".jvm.mem.pools.young.max_in_bytes",parseUnit(item.getJvm().getMem().getPools().getYoung().getMax_in_bytes(),"gb"));
            wg.sendToGraphite(frontName + ".jvm.mem.pools.survivor.used_in_bytes",parseUnit(item.getJvm().getMem().getPools().getSurvivor().getUsed_in_bytes(),"gb"));
            wg.sendToGraphite(frontName + ".jvm.mem.pools.survivor.max_in_bytes",parseUnit(item.getJvm().getMem().getPools().getSurvivor().getMax_in_bytes(), "gb"));
            wg.sendToGraphite(frontName + ".jvm.mem.pools.old.used_in_bytes",parseUnit(item.getJvm().getMem().getPools().getOld().getUsed_in_bytes(), "gb"));
            wg.sendToGraphite(frontName + ".jvm.mem.pools.old.max_in_bytes",parseUnit(item.getJvm().getMem().getPools().getOld().getMax_in_bytes(), "gb"));
            wg.sendToGraphite(frontName + ".jvm.threads.count",item.getJvm().getThreads().getCount());
            wg.sendToGraphite(frontName + ".jvm.gc.collectors.young.collection_count",item.getJvm().getGc().getCollectors().getYoung().getCollection_count());
            wg.sendToGraphite(frontName + ".jvm.gc.collectors.old.collection_count",item.getJvm().getGc().getCollectors().getOld().getCollection_count());
            wg.sendToGraphite(frontName + ".transport.rx_count",item.getTransport().getRx_count());
            wg.sendToGraphite(frontName + ".transport.rx_size_in_bytes",parseUnit(item.getTransport().getRx_size_in_bytes(),"mb"));
            wg.sendToGraphite(frontName + ".transport.tx_count",item.getTransport().getTx_count());
            wg.sendToGraphite(frontName + ".transport.tx_size_in_bytes",parseUnit(item.getTransport().getTx_size_in_bytes(), "mb"));
            wg.sendToGraphite(frontName + ".thread_pool.bulk.threads",item.getThread_pool().getBulk().getThreads());
            wg.sendToGraphite(frontName + ".thread_pool.bulk.queue",item.getThread_pool().getBulk().getQueue());
            wg.sendToGraphite(frontName + "..thread_pool.bulk.rejected",item.getThread_pool().getBulk().getRejected());
            wg.sendToGraphite(frontName + ".thread_pool.flush.threads",item.getThread_pool().getFlush().getThreads());
            wg.sendToGraphite(frontName + ".thread_pool.flush.queue",item.getThread_pool().getFlush().getQueue());
            wg.sendToGraphite(frontName + "..thread_pool.flush.rejected",item.getThread_pool().getFlush().getRejected());
            wg.sendToGraphite(frontName + ".thread_pool.get.threads",item.getThread_pool().getGet().getThreads());
            wg.sendToGraphite(frontName + ".thread_pool.get.queue",item.getThread_pool().getGet().getQueue());
            wg.sendToGraphite(frontName + "..thread_pool.get.rejected",item.getThread_pool().getGet().getRejected());
            wg.sendToGraphite(frontName + ".thread_pool.index.threads",item.getThread_pool().getIndex().getThreads());
            wg.sendToGraphite(frontName + ".thread_pool.index.queue",item.getThread_pool().getIndex().getQueue());
            wg.sendToGraphite(frontName + "..thread_pool.index.rejected",item.getThread_pool().getIndex().getRejected());
//            wg.sendToGraphite(frontName + ".thread_pool.optimize.threads",item.getThread_pool().getOptimize().getThreads());
//            wg.sendToGraphite(frontName + ".thread_pool.optimize.queue",item.getThread_pool().getOptimize().getQueue());
//            wg.sendToGraphite(frontName + "..thread_pool.optimize.rejected",item.getThread_pool().getOptimize().getRejected());
            wg.sendToGraphite(frontName + ".thread_pool.refresh.threads",item.getThread_pool().getRefresh().getThreads());
            wg.sendToGraphite(frontName + ".thread_pool.refresh.queue",item.getThread_pool().getRefresh().getQueue());
            wg.sendToGraphite(frontName + "..thread_pool.refresh.rejected",item.getThread_pool().getRefresh().getThreads());
            wg.sendToGraphite(frontName + ".thread_pool.search.threads",item.getThread_pool().getSearch().getThreads());
            wg.sendToGraphite(frontName + ".thread_pool.search.queue",item.getThread_pool().getSearch().getQueue());
            wg.sendToGraphite(frontName + "..thread_pool.search.rejected",item.getThread_pool().getSearch().getRejected());
        }
    }

    /**
     * �������뽫��������ε�λת��Ϊmb��gb
     * @param data
     * @param unit
     * @return
     */
    private String parseUnit(String data,String unit){
        Long ldata = Long.parseLong(data);
        if(unit.equalsIgnoreCase("mb")){
//            double value=(double)ldata/(1024*1024);
//            System.out.println(value);
            return String.valueOf(ldata/(1024*1024));
        }
        else if(unit.equalsIgnoreCase("gb")){
//            double value=(double)ldata/(1024*1024*1024);
//            System.out.println(value);
            return String.valueOf(ldata/(1024*1024*1024));
        }
        else
            return "0";
    }
    /**
     * �����������е����ԣ�δ����ͨ��
     * @param obj
     */
    public  void json2keyvalue(Object obj){
           Set<String> sets= ((JSONObject) obj).keySet();
            Iterator<String> it = sets.iterator();
            while (it.hasNext()){
                String value= it.next();
//                System.out.println(value);
                Object  subobject= ((JSONObject)obj).get(value);
                if(subobject instanceof  JSONObject){
                        sb.append(value + ".");
//                    cur=sb.toString();
                    json2keyvalue(subobject);
                }
                else {
//                    cur =sb.toString();
                    sb.append(value);
                    sb.append(":" + subobject.toString());
                    System.out.println(sb.toString());
//                    System.out.println("curl:"+cur);
                    sb = new StringBuffer();
//                    System.out.println(sb);
                }
            }
    }

    /**
     * ͨ��Http Rest api��ȡES��Ⱥ״̬��Ϣ
     * @param eshost ��Ⱥ��ص�ַ
     * @param api   ����ES��api�����磺_cat/health,_nodes/stats��
     * @param user ���ܷ��ʵ��û���
     * @param pwd ���ܷ��ʵ�����
     * @return ����ES��Ⱥ״̬��Ϣ��
     */
    private String getESContents(String eshost,String api,String user,String pwd){
        String result=null;
        if ( null==eshost ||null==api) return null;

        String query=eshost+api;        //����ES��ѯapi�ű�
if(eshost.startsWith("https")) {
    result = HttpClientUtil.httpsGetrequest(query, user, pwd);
//    System.out.println(result);
}else if(eshost.startsWith("http")){
    result=HttpClientUtil.httpGetData(query);
}
        return result;
    }
}

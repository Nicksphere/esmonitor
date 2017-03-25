package org.elastcisearch.service.graphite.main;

import org.elasticsearch.service.graphite.utils.Write2Graphite;

/**
 * Created by 835885 on 2016/11/23.
 */
public class MonitorMain {
    public static void main(String[] args){
        if(null ==args[0]) {
           System.out.println("configs is null");
            return;
        }
        MonitorStart obj = new MonitorStart();
//        obj.run(args[0],args[1],args[2],Integer.parseInt(args[3]));
//        System.out.println("first configs : "+args[0]);
        obj.run(args[0]);
    }
}

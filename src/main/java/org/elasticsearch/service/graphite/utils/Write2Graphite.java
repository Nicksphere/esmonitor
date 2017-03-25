package org.elasticsearch.service.graphite.utils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

/**
 * Created by 835885 on 2016/11/23.
 */
public class Write2Graphite {
    private Writer writer;
    private String host="10.202.34.202";        //carbon接收数据ip地址
    private int port=2003;                                   //carbon接收数据端口
    private String timestamp = Long.toString(System.currentTimeMillis() / 1000);
    Socket socket = null;
    public  static void main(String[] args){
        Write2Graphite obj = new Write2Graphite();
        obj.run();
    }
    public Write2Graphite(){}

    public Write2Graphite(String host,int port){
        this.host=host;
        this.port=port;
    }
    public void run() {
//        try {
//            socket = getSocket();
//            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
////            System.out.println("carbon服务传输写入数据");
//            sendToGraphite("es.cpus.inner","70");
//            sendToGraphite("es.mems.test","30");
//            writer.flush();
//        } catch (Exception e) {
////            logException(e);
//            e.printStackTrace();
//            flushWriter();
//        } finally {
//            closeSocket(socket);
//            writer = null;
//        }
    }

    /**
     * 发送数据到Graphite接收端口
     * @param name
     * @param value
     */
    public void sendToGraphite(String name, String value) {
        try {
            String nameToSend = sanitizeString(name);
            socket = getSocket();
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            System.out.println("carbon服务传输写入数据");
//            sendToGraphite("es.cpus.inner","70");
//            sendToGraphite("es.mems.test","30");
            // check if this value is excluded
//            System.out.println(nameToSend+":"+value);
            writer.write(nameToSend);
            writer.write(' ');
            writer.write(value);
            writer.write(' ');
            writer.write(timestamp);
            writer.write('\n');
            writer.flush();
        } catch (Exception e) {
//            logger.error("Error sending to Graphite:", e);
            e.printStackTrace();
        }finally {
            closeSocket(socket);
            writer = null;
        }
    }

    public void sendInt(String name,  long value) {
        sendToGraphite(name, String.format("%d", value));
    }
    public void sendInt(String name, String valueName, long value) {
        sendToGraphite(name + "." + valueName, String.format("%d", value));
    }
    public void sendFloat(String name, double value) {
        sendToGraphite(name , String.format("%2.2f", value));
    }
    public void sendFloat(String name, String valueName, double value) {
        sendToGraphite(name + "." + valueName, String.format("%2.2f", value));
    }

    protected String sanitizeString(String s) {
        return s.replace(' ', '-');
    }

    //    protected String buildMetricName(String name) {
//        return prefix + "." + name;
//    }
    private void flushWriter() {
        if (writer != null) {
            try {
                writer.flush();
            } catch (IOException e1) {
//                logger.error("Error while flushing writer:", e1);
                e1.printStackTrace();
            }
        }
    }
    public Socket getSocket() throws Exception {
        return new Socket(host, port);
    }
    private void closeSocket(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
//                logger.error("Error while closing socket:", e);
                e.printStackTrace();
            }
        }
    }
}

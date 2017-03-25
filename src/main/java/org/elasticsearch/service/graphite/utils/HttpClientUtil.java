package org.elasticsearch.service.graphite.utils;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManagerFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

/**
 * Created by 835885 on 2016/11/24.
 */
public class HttpClientUtil {
    /**
     * 处理Post请求
     * @param url
     * @param json 发送json数据格式
     * @return 返回结果字符串
     * @throws Exception
     */
    public static String httpRequestData(String url, String json) throws Exception {
        long startTime = System.currentTimeMillis();
        String returnContnet = "";
        HttpClient httpClient = new HttpClient();
        PostMethod postmethod = null;
        try {
            postmethod = new PostMethod(url);
            RequestEntity se = new StringRequestEntity(json, "application/json", "UTF-8");
            postmethod.setRequestEntity(se);
            postmethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int statusCode = httpClient.executeMethod(postmethod);
            if (statusCode != HttpStatus.SC_OK) {
                byte[] responseBody = postmethod.getResponseBody();
                returnContnet = new String(responseBody, "utf-8");
                throw new Exception(returnContnet);
            }
            byte[] responseBody = postmethod.getResponseBody();
            returnContnet = new String(responseBody, "utf-8");

        } catch (Exception e) {
            throw new Exception(e);

        } finally {
            postmethod.releaseConnection();
            httpClient = null;
            //System.out.println("HttpClientUtil 请求总耗时："+String.valueOf(System.currentTimeMillis() - startTime)+",returnContnet:"+returnContnet);
        }
        return returnContnet;
    }

    /**
     * 使用Get方式请求数据
     * @param url
     * @return
     * @throws Exception
     */
    public static String httpGetData(String url)  {
        long startTime = System.currentTimeMillis();
        String returnContnet ="";
        HttpClient httpClient =new HttpClient();
        HttpMethod method =null;
        try {
         method= new GetMethod(url);

            httpClient.executeMethod(method);
            returnContnet = method.getResponseBodyAsString();
        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            method.releaseConnection();
        }
        return returnContnet;
    }

    /**
     * 加密方式获取get请求
     * @param url
     * @param uname
     * @param pwd
     * @return
     */
    public static String httpsGetrequest(String url,String uname,String pwd){
        System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
        try {
            URL u = new URL(url);
            HttpsURLConnection http = (HttpsURLConnection)u.openConnection();
            Authenticator.setDefault( new MyAuthenticator(uname,pwd) );


            http.setHostnameVerifier(new NullHostnameVerifier());
            http.setAllowUserInteraction(true);
            http.setRequestMethod("GET");
            http.connect();

            InputStream is = http.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                stringBuilder.append(line + "\n");
            }
            return stringBuilder.toString();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        }
        }
}

class MyAuthenticator extends Authenticator
{
    private String _user = "";
    private String _pass = "";
    public MyAuthenticator(String user, String pass) {
        _user = user;
        _pass = pass;
    }
    /**
     * Called when password authorization is needed.
     * @return The PasswordAuthentication collected from the
     * user, or null if none is provided.
     */
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication (_user, _pass.toCharArray() );
    }

}



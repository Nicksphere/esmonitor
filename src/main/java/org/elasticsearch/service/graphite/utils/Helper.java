package org.elasticsearch.service.graphite.utils;

import java.util.regex.Pattern;

/**
 * Created by 835885 on 2016/11/25.
 */
public class Helper {
    /**
     * �ж��Ƿ�Ϊ�ַ����Ƿ�Ϊ����
     * @param str
     * @return
     */
    public static boolean isNumeric(String str){
        Pattern pattern= Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    public void json2keyvalue(Object obj){

    }
}

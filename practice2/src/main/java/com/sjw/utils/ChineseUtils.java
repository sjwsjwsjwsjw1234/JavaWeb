package com.sjw.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class ChineseUtils {
    public static String transfer(HttpServletRequest req, String paramName) throws UnsupportedEncodingException {
        String parameter = req.getParameter(paramName);
        String method = req.getMethod();
        if (method.equals("POST")){
            parameter=new String(parameter.getBytes("iso-8859-1"),"utf-8");

        }else{
            parameter= URLEncoder.encode(parameter,"iso-8859-1");
            parameter= URLDecoder.decode(parameter,"utf-8");
        }
        return parameter;
    }
}

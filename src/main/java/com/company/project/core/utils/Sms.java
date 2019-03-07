package com.company.project.core.utils;
 
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.stereotype.Component;
/**
 * 
 * @author tty
 * 短信发送
 *
 */
@Component
public class Sms
{
  

  public String sendSms(String mobile, String  message)
    throws IOException
  {
    String sign = "";
    
      //String content = "您好,您的" + mobile +""+message+ "手机号的账户已激活" + "【教科鲜食】 ";
      String content=message;
      
      StringBuffer sb = new StringBuffer(
        "http://web.cr6868.com/asmx/smsservice.aspx?");
      sb.append("name=15370305221");
      sb.append("&pwd=07F8424EA244D7A5C5D634CBA84B");
      sb.append("&mobile=" + mobile);
      sb.append("&content=" + URLEncoder.encode(content, "UTF-8"));
      sb.append("&stime=");
      sb.append("&sign=" + URLEncoder.encode(sign, "UTF-8"));
      sb.append("&type=pt&extno=");

      URL url = new URL(sb.toString());
      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestMethod("POST");
      InputStream localInputStream = url.openStream();
    
    return "success";
  }

  

  public static String convertStreamToString(InputStream is)
  {
    StringBuilder sb1 = new StringBuilder();
    byte[] bytes = new byte[4096];
    int size = 0;
    try {
      while ((size = is.read(bytes)) > 0) {
        String str = new String(bytes, 0, size, "UTF-8");
        sb1.append(str);
      }
    } catch (IOException e) {
      e.printStackTrace();
      try {
        is.close();
      } catch (IOException e1) {
        e1.printStackTrace();
      }
      try
      {
        is.close();
      } catch (IOException e2) {
        e.printStackTrace();
      }

      try
      {
        is.close();
      } catch (IOException e3) {
        e.printStackTrace();
      }

      try
      {
        is.close();
      } catch (IOException e4) {
        e.printStackTrace();
      }

      try
      {
        is.close();
      } catch (IOException e5) {
        e.printStackTrace();
      }

      try
      {
        is.close();
      } catch (IOException e6) {
        e.printStackTrace();
      }

      try
      {
        is.close();
      } catch (IOException e7) {
        e.printStackTrace();
      }

      try
      {
        is.close();
      } catch (IOException e8) {
        e.printStackTrace();
      }
    }
    finally
    {
      try
      {
        is.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return sb1.toString();
  }
}
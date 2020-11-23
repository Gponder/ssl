package com.gponder.ssl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@SpringBootTest
class SslApplicationTests {

    @Test
    void contextLoads() throws Exception {
        URL url = new URL("https://localhost:8443/ssl/time");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        InputStream is = urlConnection.getInputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            bos.write(buffer,0,len);
        }
        bos.flush();;
        bos.close();
        is.close();
        System.out.println(new String(bos.toByteArray()));
    }

}

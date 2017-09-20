package com.example.testword;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;


public class TestWord {

	
    public static final String APP_ID = "10146446";
    public static final String API_KEY = "AmA0gaj3alDkIKauMZxNCk4m";
    public static final String SECRET_KEY = "DSWv4bI3Vwx8DFOISGdGOeARRZHrbH35";
    
    
    public static void main(String[] args) {
		AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
		
		
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        
/*        client.setHttpProxy("proxy_host", proxy_port);
        client.setSocketProxy("proxy_host", proxy_port);
        */
        
        String path = "assets//1-50.bmp";
        JSONObject res = client.plateLicense(path);
        System.out.println(res.toString(2));

        
        
        
	}
	
}

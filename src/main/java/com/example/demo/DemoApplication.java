package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

import static com.example.demo.csv_download.readJsonFromUrl;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args)throws IOException, JSONException
    {
        SpringApplication.run(DemoApplication.class, args);
        csv_download JSONObject;

        org.json.JSONObject json = readJsonFromUrl("http://data.europa.eu/euodp/data/api/3/action/package_show?id=ef78194c-e94c-47dd-85f7-44ba98b6746c");
        System.out.println(json.toString());
        //System.out.println(json.get("id"));
        
    }

}

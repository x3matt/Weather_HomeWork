package App;
import Entity.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.metaweather.com/api/location/638242");
        Weather weather = getWeather(url,"Weather.json");
        System.out.println(weather);

    }
    private static void makeJsonFileByURL(URL url,String fileName) throws Exception{
        try(InputStream inputStream = url.openStream();
            FileOutputStream outputStream = new FileOutputStream(fileName)){
            int in = 0;
            byte[] buf = new byte[1024];
            while((in = inputStream.read(buf)) != -1) {
                outputStream.write(buf,0,in);
            }
        }
    }
    public static Weather getWeather(URL url,String fileName) throws Exception{
    makeJsonFileByURL(url,fileName);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fileName),Weather.class);
    }
}

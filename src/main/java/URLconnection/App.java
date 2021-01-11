package URLconnection;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https","geekbrains.ru", 443, "/");
        InputStream inputStream = url.openStream();
        // #1
        //new BufferedReader(new InputStreamReader(inputStream, UTF_8))
        //.lines()
        //    .forEach(System.out::println); // для каждой строки
        
        URLConnection  urlConnection = url.openConnection();
        inputStream = urlConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, UTF_8));

        


        }
    }


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Homework {
    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=kxNrBs32hz9M1GxhryTAiALF6TBBnTcO&language=ru&metric=true&details=true")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.code()); // код работает
            System.out.println(response.body().string());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

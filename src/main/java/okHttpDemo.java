import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class okHttpDemo {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .writeTimeout(10,TimeUnit.SECONDS)
                .followRedirects(true) // переход клиента по директориям (по умолчанию false)
                .retryOnConnectionFailure(true) // если с 1 раза клиенту не удастся поключится, он будет пытаться снова
                .build(); // собирание всех опций воедино

        Request request = new Request.Builder()
                .url("http://geekbrains.ru")
                .build();

        Response response = client.newCall(request).execute();

        System.out.println(response.code()); // код работает
        System.out.println(response.headers());
        System.out.println(response.isRedirect()); // был ли редирект или нет
        System.out.println(response.isSuccessful());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis()); // как быстро мы получили ответ


    }
}

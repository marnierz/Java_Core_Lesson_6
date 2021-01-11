package URL;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        URL url1 = new URL("https://geekbrains.ru/lessons/98864");
        URL url2 = new URL("https","geekbrains.ru", 443, "/");

        System.out.println(url1.getFile()); // получение каталога после хоста
        System.out.println(url1.getHost()); // берет только хост
        System.out.println(url1.getPath()); // все что идет после хоста
        System.out.println("----------------");
        System.out.println(url2.getPort()); // вывод порта
        System.out.println(url2.getProtocol()); // вывод протокола
        System.out.println(url2.getUserInfo()); // ничего, так как нет инфы про пользователя
        System.out.println(url2.getAuthority()); // вывод хоста и порта
        System.out.println("----------------");

        System.out.println(url2.toURI()); // переводит url в uri


    }
}

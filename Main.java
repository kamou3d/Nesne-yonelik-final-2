import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PageProvider page = new BiographyPage();
        HttpResponseBuilder builder = new HttpResponseBuilder();
        new WebServer(1989, page, builder).start();
    }
}

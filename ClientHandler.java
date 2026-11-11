import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/** Tek bir istemci bağlantısını işler: isteği okur, yanıtı yazar. */
public class ClientHandler implements Runnable {

    private final Socket socket;
    private final PageProvider pageProvider;
    private final HttpResponseBuilder responseBuilder;

    public ClientHandler(Socket socket, PageProvider pageProvider, HttpResponseBuilder responseBuilder) {
        this.socket = socket;
        this.pageProvider = pageProvider;
        this.responseBuilder = responseBuilder;
    }

    @Override
    public void run() {
        try (Socket s = socket;
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(s.getInputStream(), StandardCharsets.UTF_8));
             OutputStream out = s.getOutputStream()) {

            String line;
            while ((line = in.readLine()) != null && !line.isEmpty()) {
                // İstek satırı ve başlıklar okunur (boş satıra kadar)
            }
            out.write(responseBuilder.build(pageProvider.getContent()));
            out.flush();
        } catch (IOException e) {
            System.err.println("İstemci hatası: " + e.getMessage());
        }
    }
}

import java.nio.charset.StandardCharsets;

/** Verilen içerikten geçerli bir HTTP/1.1 yanıtı oluşturur. */
public class HttpResponseBuilder {

    public byte[] build(String html) {
        byte[] body = html.getBytes(StandardCharsets.UTF_8);
        String header = "HTTP/1.1 200 OK\r\n"
                      + "Content-Type: text/html; charset=UTF-8\r\n"
                      + "Content-Length: " + body.length + "\r\n"
                      + "Connection: close\r\n\r\n";
        byte[] head = header.getBytes(StandardCharsets.UTF_8);
        byte[] response = new byte[head.length + body.length];
        System.arraycopy(head, 0, response, 0, head.length);
        System.arraycopy(body, 0, response, head.length, body.length);
        return response;
    }
}

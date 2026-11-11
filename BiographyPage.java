/** Ad, öğrenci no ve biyografiyi içeren HTML sayfasını üretir. */
public class BiographyPage implements PageProvider {

    private static final String AD_SOYAD = "Samet Artan";      // <-- kendi bilgilerinizi yazın
    private static final String OGRENCI_NO = "Öğrenci No: 1250505062";

    @Override
    public String getContent() {
        return "<!DOCTYPE html>\n"
             + "<html lang=\"tr\">\n<head>\n<meta charset=\"UTF-8\">\n"
             + "<title>" + AD_SOYAD + "</title>\n"
             + "<style>\n"
             + "body { background-color:#f0f4f8; font-family:Georgia, serif; margin:40px; }\n"
             + "h1 { color:#1a237e; font-family:Verdana, sans-serif; }\n"
             + "h2 { color:#c62828; font-family:'Courier New', monospace; }\n"
             + "p  { color:#333333; font-size:18px; line-height:1.6; }\n"
             + ".vurgu { color:#2e7d32; font-weight:bold; font-style:italic; }\n"
             + "</style>\n</head>\n<body>\n"
             + "<h1>" + AD_SOYAD + "</h1>\n"
             + "<h2>" + OGRENCI_NO + "</h2>\n"
             + "<hr>\n"
             + "<p>Merhaba! Ben bir <span class=\"vurgu\">bilgisayar programcılığı</span> öğrencisiyim. "
             + "Java ile nesne yönelimli programlama ve ağ programlama üzerine çalışıyorum.</p>\n"
             + "<p>Boş zamanlarımda <span class=\"vurgu\">kitap okumayı</span> ve yeni teknolojileri "
             + "keşfetmeyi seviyorum. Hedefim yazılım geliştirme alanında kendimi sürekli geliştirmektir.</p>\n"
             + "</body>\n</html>";
    }
}

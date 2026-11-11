# Java Socket ile Basit Web Sunucusu

Bu proje, Nesne Yönelimli Programlama dersi final değerlendirmesi kapsamında geliştirilmiş, herhangi bir 3. parti kütüphane kullanılmadan yalnızca **Java Standart Kütüphanesi (Core Java)** ile yazılmış basit bir HTTP web sunucusudur.

## Özellikler
* Harici bağımlılık (framework/kütüphane) içermez.
* `1989` portu üzerinden HTTP/1.1 standartlarında hizmet verir.
* İstemcilere (tarayıcılara) HTML5 formatında, CSS ile biçimlendirilmiş bir biyografi sayfası sunar.
* Thread Pool (İş parçacığı havuzu) mimarisi sayesinde aynı anda birden fazla bağlantıyı eşzamanlı olarak işleyebilir.

## Gereksinimler
* Java Development Kit (JDK) 8 veya üzeri

## Kurulum ve Çalıştırma
Projeyi derlemek ve çalıştırmak için terminal (veya komut satırı) üzerinden proje dosyalarının bulunduğu dizine giderek aşağıdaki komutları sırasıyla çalıştırın:

```bash
javac *.java
java Main
```

Sunucu çalışmaya başladıktan sonra herhangi bir web tarayıcısından aşağıdaki adrese giderek sayfayı görüntüleyebilirsiniz:
`http://localhost:1989`

## Proje Mimarisi
Projede SOLID prensipleri gözetilerek sınıflar arası sorumluluklar modüler bir şekilde dağıtılmıştır:

| Sınıf | Görev |
|---|---|
| `Main` | Uygulamanın giriş noktasıdır. Bağımlılıkları oluşturur ve sunucuyu başlatır. |
| `WebServer` | Belirtilen portu (1989) dinler ve gelen istemci bağlantılarını kabul eder. |
| `ClientHandler` | Her bir istemci bağlantısını (soketi) ayrı bir iş parçacığında okur ve yanıtlar. |
| `PageProvider` | Sunulacak sayfa içeriğinin üretilmesi için standart bir sözleşme (arayüz) sağlar. |
| `BiographyPage` | Ad, öğrenci no ve biyografi bilgilerini içeren geçerli bir HTML yapısı oluşturur. |
| `HttpResponseBuilder` | Üretilen HTML içeriğini alır ve geçerli bir HTTP/1.1 yanıt paketine dönüştürür. |
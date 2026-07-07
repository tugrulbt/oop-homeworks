# 💻 Nesne Yönelimli Programlama (OOP) Ödevleri

Bu depo, bilgisayar mühendisliği eğitimi sürecinde geliştirilen Java tabanlı Nesne Yönelimli Programlama projelerini içermektedir.

## 📁 Proje İçerikleri

### 1. Öğrenci Not Yönetim Sistemi (`student_grade_management_system`)
Eğitim kurumları için tasarlanmış; öğrencilerin sınav notlarını kaydeden, sınıf ortalamalarını analiz eden ve başarı durumlarına göre filtreleme/sıralama yapan konsol tabanlı otomasyon sistemidir.

**Kullanılan Teknolojiler ve Akademik Konseptler:**
* **Veri Yapıları:** Öğrenci bilgilerini ve notlarını senkronize tutmak için çoklu paralel diziler (Arrays) kullanıldı.
* **Sıralama Algoritmaları (Sorting):** Öğrencileri notlarına göre sıralamak amacıyla klasik **Bubble Sort** algoritması koda manuel olarak entegre edildi.
* **Modülerlik:** Her bir analiz işlemi (Min/Max bulma, ortalama hesaplama, filtreleme) ayrı metotlara (functions) bölünerek kodun okunabilirliği ve tekrar edilebilirliği (Clean Code) artırıldı.
* **Hata Kontrolü (Exception Handling):** Sisteme veri girilmeden işlem yapılmasını engelleyen önleyici mantık (guard clauses) eklendi.

### 2. 2D Geometri ve Nesne İlişkileri (`_2d_geometry_primitives`)
Nesne Yönelimli Programlamanın temel kavramlarından olan Kompozisyon (Composition) ve Agregasyon (Aggregation) yapılarını, matematiksel bir 2D koordinat sistemi üzerinde modelleyen uygulamadır.

**Kullanılan Teknolojiler ve Akademik Konseptler:**
* **Nesne İlişkileri:** Sınıfların birbirini kapsama durumları pratik edildi. (Örn: Bir `Line` objesinin, iki adet `Point` objesinden oluşması).
* **Veri Yönetimi & Dinamizm:** Koordinat noktalarını dinamik olarak depolamak ve birbirine bağlamak için `List<Point>` (ArrayList) kullanıldı.
* **Algoritmik Hesaplama:** Koordinat düzleminde iki nokta veya bir çizgi silsilesi arasındaki toplam mesafeyi bulan matematiksel (Öklid) uzunluk algoritmaları (örn: `Math.sqrt`) sisteme entegre edildi.
* **Overloading (Aşırı Yükleme):** Aynı isimde fakat farklı parametreler alan metotlar (örn: `appendPoint(int x, int y)` ve `appendPoint(Point p)`) kullanılarak esneklik sağlandı.

### 3. Telekomünikasyon Faturalandırma Simülasyonu (`Telekom`)
Bir telekomünikasyon firması için geliştirilmiş; telefon hatlarının (Faturalı/Faturasız) arama geçmişlerini, anlık fatura/bakiye durumlarını ve çağrı istatistiklerini yöneten gelişmiş bir backend simülasyonudur.

**Kullanılan Teknolojiler ve Akademik Konseptler:**
* **Temel OOP Prensipleri:** Kalıtım (Inheritance) ve Kapsülleme (Encapsulation). Tüm state'ler `private` korunarak `getter/setter` metotlarıyla güvenli erişim sağlandı.
* **Veri Yapıları & Algoritmalar:** Çağrı kayıtlarını (Konuşma) saklamak, en uzun görüşmeyi tespit etmek ve numaraları arama sıklığına göre sıralamak için kapsamlı `ArrayList` manipülasyonları.
* **İş Mantığı (Business Logic):**
  * `FaturaliHat`: Aylık ücretsiz dakika aşımında algoritmik fatura hesaplama (Aşılan her 60 sn için 2 TL ek ücret).
  * `FaturasizHat`: Bakiye mantığı ile anlık ücretlendirme (Saniyesi 0.05 TL) ve limit bittiğinde operasyonun (çağrının) kesilmesi.

### 4. İnteraktif Pizza Sipariş Sistemi (`PizzaSiparisi`)
Kullanıcı dostu grafik arayüze (GUI) sahip, görsellerle desteklenmiş bir masaüstü sipariş uygulaması.

**Kullanılan Teknolojiler ve Akademik Konseptler:**
* **Geliştirme Dili:** Java
* **Proje Altyapısı:** Maven (`pom.xml` ile modül ve bağımlılık yönetimi)
* **Temel OOP Prensipleri:** Sınıf yapıları (Classes), Kalıtım (Inheritance) ve Kapsülleme (Encapsulation)
* **Kullanıcı Arayüzü:** Özel görseller (ikonlar ve ürün fotoğrafları) içeren etkileşimli panel
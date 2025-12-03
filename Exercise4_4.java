public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        // Cevap 1: Dönen değer kullanılmasa bile Java çalıştırır, derleyici hata vermez. Sadece IDE uyarısı olabilir.

        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevap 2: Void metod bir değer döndürmediği için ifade içinde kullanılamaz. Derleme hatası verir.


        // Cevaplarinizi yorum olarak ekleyin.
    }
}

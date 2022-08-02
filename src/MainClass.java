import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        //Ürünlerin isimlerini ve fiyatlarının tanımlandığı kısım
        String [] urun = {"Armut","2.14","Elma","3.67","Domates","1.11","Muz","0.95","Patlıcan","5"};

        //Projenin başlığını ekrana yazdırıyoruz
        System.out.println("*** Manav Kasa Programı ***\n");

        //Toplam hesap ve kg bilgisi için değişkenler oluşturuyoruz
        double hesap=0;
        double kg;

        //Girilecek olan her satırı for döngüsüyle döndürüp fiyatlarını hesaplatıyoruz
        for(int i=0;i<urun.length;i+=2){
            System.out.print("\n"+urun[i]+" Kaç Kg? >");
            kg=s.nextDouble();
            //Ürün fiyatlarını dizi içerisinden çekip işlem yapabilmek için double veri tipine dönüştürüyoruz
            double urunFiyat = Double.parseDouble(urun[i+1]);

            //Fiyatı toplam hesaba dahil edip kalem fiyatını görüntülüyoruz
            hesap+=(kg*urunFiyat);
            System.out.println(kg+" x "+urunFiyat+" = "+(kg*urunFiyat));
        }

        //Son olarak da toplam hesabı yazdırıp programı bitiriyoruz
        System.out.println("\nToplam Hesap: "+hesap+" TL");
    }
}

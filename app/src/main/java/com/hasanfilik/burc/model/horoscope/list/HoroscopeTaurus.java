package com.hasanfilik.burc.model.horoscope.list;

import android.annotation.SuppressLint;
import android.os.Parcel;

import androidx.annotation.NonNull;

import com.hasanfilik.burc.R;
import com.hasanfilik.burc.model.horoscope.Horoscope;
@SuppressLint("ParcelCreator")
public class HoroscopeTaurus implements Horoscope {
    @Override
    public String getName() {
        return "Boğa";
    }

    @Override
    public String getDescription() {
        return "BOĞA BURCU ÖZELLİKLERİ(21 Nisan - 20 Mayıs)" +
                "\n\nToprak grubunun en dingin ve gözlemcisi…\n\n" +
                "Yıldızın: Venüs (Güzellik, sevgi ve güzel sanatların temsilcisi)\n\n" +
                "Grubun: Toprak, negatif\n\n" +
                "Niteliği: Sabit\n\n" +
                "Burcunun cinsiyeti: Dişi\n\n" +
                "Yeteneğin: Sıcakkanlı olmak ve istediğini bilmek, hırslı olmak\n\n" +
                "Özelliğin: Dost ruh ve koruyucu… İnatçılığın lüksü sembolize eder. Astrologlar Boğa’ya \"Zenginlik Burcu\" der.\n\n" +
                "Hedefin: Devamlı ileri atılım\n\n" +
                "Amacın: Mal, mülk, lüks ve büyük servet sahibi olmak\n\n" +
                "Anahtar sözcüğün: Süreklilik, güven\n\n" +
                "Bastırman gereken huyun: Alınganlık, kuşku, lüks özlemi ve bencillik \n\n" +
                "En büyük kozun: Karşındakinin düşüncesini okuyabilme yeteneğin\n\n" +
                "Aradığın: Sağlam temeli olan her şey ve güvenli gelecek\n\n" +
                "Gitmeyi sevdiğin yerler: Doğa, kırlar, lüks olan her ortam\n\n" +
                "Yapmaktan keyif aldıkların: Bahçe işleri, yemek, alış veriş\n\n" +
                "Şanslı günün: Cuma\n\n" +
                "Şanslı Sayların: 5, 25, 75\n\n" +
                "Şanslı taşın: Zümrüt\n\n" +
                "Şans getiren renklerin: Mavi, krem ve koyu yeşil, pembe\n\n" +
                "Sevdiğin çiçekler: Kırmızı gül, pembe karanfil, Müge\n\n" +
                "Bitkilerin: Alman papatyası ve Mürver\n\n" +
                "Müzik tarzın: Senfoniler\n\n" +
                "Vücutta temsil ettiğin bölgeler: Boğaz, boyun ve ense bölgesi \n\n" +
                "Mevsimin: İlkbahar \n\n" +
                "Olası Hastalıkların: Tiroid bezi ve boğaz hastalıkları, ses telleri sorunu, bademcik iltihabı, diyabetik rahatsızlıklar…\n\n" +
                "Sağlına yararlı besinler: Tavuk eti, hindi eti, tam tahılı buğday ekmeği, salata ve baklagiller\n\n" +
                "Uzak durulması gereken besinler: Tatlı gıdalar, şekerlemeler, bisküvi ve çikolata\n\n" +
                "Uyumlu Burç: Yengeç, Başak, Oğlak ve Balık\n\n" +
                "Karşıt Burcun: Akrep\n\n" +
                "Başarılı olacağın meslekler: Askerlik, doktorluk, kimya alanı, dişçilik, demir çelik işleri, ticaret, mühendislik, endüstri dalları, antikacılık, çocuk doktoru, mühendislik, pratik meslekler\n\n" +
                "Olumlu özelliklerin: Sabit ve dürüst… Aşırı duygusal, kendi halinde, gayet sakin… Şefkatli ve cömert… Pratik. Çok üretken ve verimli... Soğukkanlı, paniksiz, rahatına düşkün…\n\n" +
                "Olumsuz özelliklerin: İnatçı, mesafeli, duygusal zevklere karşı aşırı hoşgörülü, kendini fazla düşünen, kimseye kolay güvenmeyen, risk almaktan hoşlanmayan\n\n" +
                "Burcunun yönettiği ülkeler: İran, İrlanda, Arjantin, İtalya, Finlandiya, K.Asya, Kıbrıs\n\n" +
                "Burcunun yönettiği şehirler: Dublin, Leibzig, Parma, Nantes, Zürich, Lozan";
    }

    @Override
    public int getDrawableId() {
        return R.drawable.taurus200;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

    }

    public static final Creator<Horoscope> CREATOR = new Creator<Horoscope>() {
        @Override
        public Horoscope createFromParcel(Parcel in) {
            return new HoroscopeTaurus();
        }

        @Override
        public Horoscope[] newArray(int size) {
            return new HoroscopeTaurus[size];
        }
    };
}

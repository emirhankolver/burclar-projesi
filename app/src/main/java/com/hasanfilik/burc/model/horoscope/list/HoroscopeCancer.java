package com.hasanfilik.burc.model.horoscope.list;

import android.annotation.SuppressLint;
import android.os.Parcel;

import androidx.annotation.NonNull;

import com.hasanfilik.burc.R;
import com.hasanfilik.burc.model.horoscope.Horoscope;

public class HoroscopeCancer implements Horoscope {
    @Override
    public String getName() {
        return "Yengeç";
    }

    @Override
    public String getDescription() {
        return "BOĞA BURCU ÖZELLİKLERİ(21 Nisan - 20 Mayıs)" +
                "Toprak grubunun en dingin ve gözlemcisi…<br><br>" +
                "Yıldızın: Venüs (Güzellik, sevgi ve güzel sanatların temsilcisi)<br><br>" +
                "<font color=\"red\">Grubun: Toprak, negatif</font><br><br>" +
                "Niteliği: Sabit<br><br>" +
                "Burcunun cinsiyeti: Dişi<br><br>" +
                "Yeteneğin: Sıcakkanlı olmak ve istediğini bilmek, hırslı olmak<br><br>" +
                "Özelliğin: Dost ruh ve koruyucu… İnatçılığın lüksü sembolize eder. Astrologlar Boğa’ya \"Zenginlik Burcu\" der.<br><br>" +
                "Hedefin: Devamlı ileri atılım<br><br>" +
                "<b>Amacın</b>: Mal, mülk, lüks ve büyük servet sahibi olmak<br><br>" +
                "Anahtar sözcüğün: Süreklilik, güven<br><br>" +
                "Bastırman gereken huyun: Alınganlık, kuşku, lüks özlemi ve bencillik <br><br>" +
                "En büyük kozun: Karşındakinin düşüncesini okuyabilme yeteneğin<br><br>" +
                "Aradığın: Sağlam temeli olan her şey ve güvenli gelecek<br><br>" +
                "Gitmeyi sevdiğin yerler: Doğa, kırlar, lüks olan her ortam<br><br>" +
                "Yapmaktan keyif aldıkların: Bahçe işleri, yemek, alış veriş<br><br>" +
                "Şanslı günün: Cuma<br><br>" +
                "Şanslı Sayların: 5, 25, 75<br><br>" +
                "Şanslı taşın: Zümrüt<br><br>" +
                "Şans getiren renklerin: Mavi, krem ve koyu yeşil, pembe<br><br>" +
                "Sevdiğin çiçekler: Kırmızı gül, pembe karanfil, Müge<br><br>" +
                "Bitkilerin: Alman papatyası ve Mürver<br><br>" +
                "Müzik tarzın: Senfoniler<br><br>" +
                "Vücutta temsil ettiğin bölgeler: Boğaz, boyun ve ense bölgesi <br><br>" +
                "Mevsimin: İlkbahar <br><br>" +
                "Olası Hastalıkların: Tiroid bezi ve boğaz hastalıkları, ses telleri sorunu, bademcik iltihabı, diyabetik rahatsızlıklar…<br><br>" +
                "Sağlına yararlı besinler: Tavuk eti, hindi eti, tam tahılı buğday ekmeği, salata ve baklagiller<br><br>" +
                "Uzak durulması gereken besinler: Tatlı gıdalar, şekerlemeler, bisküvi ve çikolata<br><br>" +
                "Uyumlu Burç: Yengeç, Başak, Oğlak ve Balık<br><br>" +
                "Karşıt Burcun: Akrep<br><br>" +
                "Başarılı olacağın meslekler: Askerlik, doktorluk, kimya alanı, dişçilik, demir çelik işleri, ticaret, mühendislik, endüstri dalları, antikacılık, çocuk doktoru, mühendislik, pratik meslekler<br><br>" +
                "Olumlu özelliklerin: Sabit ve dürüst… Aşırı duygusal, kendi halinde, gayet sakin… Şefkatli ve cömert… Pratik. Çok üretken ve verimli... Soğukkanlı, paniksiz, rahatına düşkün…<br><br>" +
                "Olumsuz özelliklerin: İnatçı, mesafeli, duygusal zevklere karşı aşırı hoşgörülü, kendini fazla düşünen, kimseye kolay güvenmeyen, risk almaktan hoşlanmayan<br><br>" +
                "Burcunun yönettiği ülkeler: İran, İrlanda, Arjantin, İtalya, Finlandiya, K.Asya, Kıbrıs<br><br>" +
                "Burcunun yönettiği şehirler: Dublin, Leibzig, Parma, Nantes, Zürich, Lozan";
    }

    @Override
    public int getDrawableId() {
        return R.drawable.cancer200;
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
            return new HoroscopeCancer();
        }

        @Override
        public Horoscope[] newArray(int size) {
            return new HoroscopeCancer[size];
        }
    };
}

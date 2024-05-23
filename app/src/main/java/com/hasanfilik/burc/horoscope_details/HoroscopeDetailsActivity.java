package com.hasanfilik.burc.horoscope_details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.navigation.ui.NavigationUI;

import com.hasanfilik.burc.databinding.ActivityHoroscopeDetailsBinding;
import com.hasanfilik.burc.model.horoscope.Horoscope;

public class HoroscopeDetailsActivity extends AppCompatActivity {

    private ActivityHoroscopeDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHoroscopeDetailsBinding.inflate(getLayoutInflater());
        setSupportActionBar(binding.toolbar);
        initUI();
        setContentView(binding.getRoot());
    }

    private void initUI() {
        Horoscope horoscope = getHoroscopeInfo();
        if (horoscope == null) {
            Toast.makeText(this, "Burç bilgisi alınamadı. Kodunu kontrol et.", Toast.LENGTH_SHORT).show();
            return;
        }
        setTitle(horoscope.getName());
        Spanned spannedText = Html.fromHtml(horoscope.getDescription(), Html.FROM_HTML_MODE_LEGACY);
        binding.tvDescription.setText(spannedText);
    }

    @Nullable
    private Horoscope getHoroscopeInfo() {
        Intent intent = getIntent();
        return intent.getParcelableExtra("horoscope");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    public static void launch(Context context, Horoscope horoscope) {
        Intent intent = new Intent(context, HoroscopeDetailsActivity.class);
        intent.putExtra("horoscope", horoscope);
        context.startActivity(intent);
    }
}
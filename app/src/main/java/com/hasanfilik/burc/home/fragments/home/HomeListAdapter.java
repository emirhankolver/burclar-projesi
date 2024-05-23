package com.hasanfilik.burc.home.fragments.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.hasanfilik.burc.databinding.ListItemHoroscopeBinding;
import com.hasanfilik.burc.model.horoscope.Horoscope;

import java.util.ArrayList;

public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {
    private final ArrayList<Horoscope> list = new ArrayList<>();
    @Nullable
    private Listener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListItemHoroscopeBinding binding = ListItemHoroscopeBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(ArrayList<Horoscope> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void setListener(@Nullable Listener listener) {
        this.listener = listener;
        notifyDataSetChanged();// LİSTEYİ GÜNCELLER!
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ListItemHoroscopeBinding binding;
        @Nullable
        private final Listener listener;

        public ViewHolder(ListItemHoroscopeBinding binding, @Nullable Listener listener) {
            super(binding.getRoot());
            this.binding = binding;
            this.listener = listener;
        }

        public void bind(Horoscope data) {
            binding.tvTitle.setText(data.getName());
            binding.imageView.setImageResource(data.getDrawableId());
            binding.getRoot().setOnClickListener(v -> {
                if (listener != null) {
                    listener.onItemClick(data);
                }
            });
        }
    }

    public interface Listener {
        void onItemClick(Horoscope data);
    }
}
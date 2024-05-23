package com.hasanfilik.burc.home.fragments.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hasanfilik.burc.databinding.ListItemHoroscopeBinding;
import com.hasanfilik.burc.model.HomeListData;

import java.util.ArrayList;

public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {
    private final ArrayList<HomeListData> list = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(ListItemHoroscopeBinding.inflate(inflater, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(ArrayList<HomeListData> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ListItemHoroscopeBinding binding;

        public ViewHolder(ListItemHoroscopeBinding binding ) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(HomeListData data) {
            binding.tvTitle.setText(data.getName());
            binding.imageView.setImageResource(data.getDrawableId());
        }
    }
}
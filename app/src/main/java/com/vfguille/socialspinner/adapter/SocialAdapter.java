package com.vfguille.socialspinner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.vfguille.socialspinner.R;
import com.vfguille.socialspinner.model.Social;

import java.util.List;

public class SocialAdapter extends ArrayAdapter<Social> {

    public SocialAdapter(@NonNull Context context, List<Social> list) {
        super(context, R.layout.item_social, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;
        if (view == null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_social, null);
            viewHolder.icon = view.findViewById(R.id.ivScoial);
            viewHolder.name = view.findViewById(R.id.tvSocial);
            view.setTag(viewHolder);
        }else
            viewHolder = (ViewHolder) view.getTag();
        viewHolder.icon.setImageResource(getItem(position).getIcon());
        viewHolder.name.setText(getItem(position).getName());
        return view;
    }

    private static class ViewHolder{
        private ImageView icon;
        private TextView name;
    }
}
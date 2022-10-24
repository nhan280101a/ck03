package com.example.frag.fragment.itemTab1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frag.R;
import com.example.frag.fragment.HomeFragment;

import java.util.List;

public class Photo1Adapter extends  RecyclerView.Adapter<Photo1Adapter.UserViewHolder> {

    private HomeFragment mContext;
    private List<photo1> mListUser;

    public Photo1Adapter(HomeFragment mContext, List<photo1> mListUser) {
        this.mContext = mContext;
        this.mListUser = mListUser;
    }

    public Photo1Adapter(HomeFragment mContext) {
        this.mContext = mContext;
    }

    public void setData(List<photo1> list) {
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_photo, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public int getItemCount() {
        if (mListUser != null) {
            return mListUser.size();
        }
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        photo1 user = mListUser.get(position);
        if (user == null) {
            return;
        }
        holder.imgResource.setImageResource(user.getResourceId());
        holder.about.setText(user.getAbout());
        holder.price.setText(user.getPrice());
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgResource;
        private TextView about;
        private TextView price;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imgResource = itemView.findViewById(R.id.img_slider);
            about = itemView.findViewById(R.id.about);
            price = itemView.findViewById(R.id.price);
        }
    }
}

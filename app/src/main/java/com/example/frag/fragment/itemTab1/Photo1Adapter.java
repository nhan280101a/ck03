package com.example.frag.fragment.itemTab1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frag.Adapter.TrendAdapter;
import com.example.frag.R;
import com.example.frag.activity.TrendDetail;
import com.example.frag.fragment.HomeFragment;
import com.example.frag.fragment.TourDetails;
import com.example.frag.model.Trend_ItemList;
import com.example.frag.model.photo1;

import java.util.ArrayList;
import java.util.List;

public class Photo1Adapter extends  RecyclerView.Adapter<Photo1Adapter.UserViewHolder> {

    Context context;
    ArrayList<photo1> arrayList;
    TrendAdapter.RecyclerItemClick itemClick;

    public Photo1Adapter(Context context, ArrayList<photo1> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.itemClick = itemClick;
    }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_photo, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        photo1 user = arrayList.get(position);
        if (user == null) {
            return;
        }
        holder.imgResource.setImageResource(user.getResourceId());
        holder.name.setText(user.getName());
        holder.price.setText(user.getPrice());
    }

    public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imgResource;
        private TextView name;
        private TextView price;
        private TextView about;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imgResource = itemView.findViewById(R.id.img_slider);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            about = itemView.findViewById(R.id.tourtrend);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int postion = getAdapterPosition();
            Toast.makeText(context, "postion" + postion, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context, TourDetails.class);
            intent.putExtra("image", arrayList.get(postion).getResourceId());
            intent.putExtra("name", arrayList.get(postion).getName());
            intent.putExtra("price", arrayList.get(postion).getPrice());
            intent.putExtra("about", arrayList.get(postion).getAbout());

            context.startActivity(intent);
        }
    }
}

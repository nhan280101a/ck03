package com.example.frag.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frag.R;
import com.example.frag.fragment.itemTab1.item;
import com.example.frag.model.Trend_ItemList;

import java.util.ArrayList;

public class TrendAdapter extends RecyclerView.Adapter<TrendAdapter.TrendRecyclerHolder>{

    Context context;
    ArrayList<Trend_ItemList> arrayList;
    RecyclerItemClick itemClick;

    public TrendAdapter(Context context, ArrayList<Trend_ItemList> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public TrendRecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, parent, false);
        return new TrendRecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendAdapter.TrendRecyclerHolder holder, int position) {
        Trend_ItemList it =arrayList.get(position);
        if(it == null){
            return;
        }
        holder.imgItem.setImageResource(it.getImgResource());
        holder.tvTitulo.setText(it.getTitulo());
        holder.tvDescripcion.setText(it.getDescripcion());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                itemClick.itemClick(item);
//
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public interface RecyclerItemClick {
        void itemClick(item it);
    }


    public class TrendRecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView imgItem;
        private TextView tvTitulo;
        private TextView tvDescripcion;

        public TrendRecyclerHolder(@NonNull View itemView) {
            super(itemView);

            imgItem = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
        }
    }

}

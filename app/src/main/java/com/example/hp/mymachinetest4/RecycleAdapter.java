package com.example.hp.mymachinetest4;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by hp on 02-08-2017.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.SubClass> {
    private List<NewsItem> newsList;
    Context context;
    public RecycleAdapter(Context context, List<NewsItem> retlist) {
        this.context = context;
        this.newsList =retlist;
    }
    @Override
    public RecycleAdapter.SubClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new SubClass(view);
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.SubClass holder, int position) {
        NewsItem newsItem = newsList.get(position);
        String img_url = "http://iroidtech.com/wecare/uploads/unit_details/";


        holder.tvNewsTitle.setText(newsItem.getTitle());
        holder.tvNewsDate.setText(newsItem.getPlace());
        holder.tvNewsContent.setText(newsItem.getAddress());

     if (!TextUtils.isEmpty(newsItem.getImage())) {
            Picasso.with(context)
                    .load(img_url+newsItem.getImage())
                    .error(R.drawable.piccc)
                    .into(holder.ivNewsImage);
        }



    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class SubClass extends RecyclerView.ViewHolder {
        protected ImageView ivNewsImage;
        protected TextView tvNewsTitle, tvNewsContent, tvNewsDate;
        public SubClass(View itemView) {
            super(itemView);
            this.ivNewsImage = (ImageView) itemView.findViewById(R.id.imv);
            this.tvNewsTitle = (TextView) itemView.findViewById(R.id.tv1);
            this.tvNewsContent = (TextView) itemView.findViewById(R.id.tv2);
            this.tvNewsDate = (TextView) itemView.findViewById(R.id.tv3);
        }
    }
}

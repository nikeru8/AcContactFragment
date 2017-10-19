package com.hello.kaiser.test;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaiser on 2017/10/19.
 */

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.Holder> {

    private List<String> data;

    class Holder extends RecyclerView.ViewHolder {

        private TextView text;

        public Holder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.item_show);
        }
    }

    public void setData() {

        data = new ArrayList<>();
        //塞假資料，讓RecyclerView看起來有資料更新
        int randomNumber = (int) (Math.random() * 9);
        for (int i = 0; i < randomNumber; i++) {
            data.add("item = " + i);
        }


        notifyDataSetChanged();
    }


    @Override
    public TestAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(TestAdapter.Holder holder, int position) {
        holder.text.setText(data.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}

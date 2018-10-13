package com.example.kananote.mysamplerobohonvoice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SpeechAdapter extends BaseAdapter{
    Context context;
    LayoutInflater layoutInflater = null;
    ArrayList<Speech> speechList;


    public SpeechAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setSpeechList(ArrayList<Speech> speechList) {
        this.speechList = speechList;
    }


    @Override
    public int getCount() {
        return speechList.size();
    }

    @Override
    public Object getItem(int i) {
        return speechList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return speechList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.listview_layout,viewGroup,false);

        ((TextView)view.findViewById(R.id.Name)).setText(speechList.get(i).getName());
        ((TextView)view.findViewById(R.id.Talk)).setText(String.valueOf(speechList.get(i).getTalk()));

        return view;
    }
}

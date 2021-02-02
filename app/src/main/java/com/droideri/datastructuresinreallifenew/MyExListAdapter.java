package com.droideri.datastructuresinreallifenew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MyExListAdapter extends BaseExpandableListAdapter {

    Context context;
    List<String> words;
    Map<String, String> definations;


    public MyExListAdapter(Context context, List<String> words, Map<String, String> definations) {
        this.context = context;
        this.words = words;
        this.definations = definations;
    }

    @Override
    public int getGroupCount() {
        return words.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return words.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return definations.get(words.get(groupPosition));
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String word = (String) getGroup(groupPosition);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_parent, null);
        }
        TextView textParent = (TextView) convertView.findViewById(R.id.textParent);
        textParent.setText(word);
        return convertView;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String defination = (String) getChild(groupPosition, childPosition);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_child, null);
        }
        TextView textChild = (TextView) convertView.findViewById(R.id.textChild);
        textChild.setText(defination);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}

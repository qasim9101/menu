package com.thebigq.menu;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<MenuItem> {

    private Activity context;
    private List<MenuItem> menuItems;

    public MyAdapter( Activity context, List<MenuItem> menuItems ){

        super(context, R.layout.menu_layout, menuItems );
        this.context = context;
        this.menuItems = menuItems;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.menu_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewDesc = (TextView) listViewItem.findViewById(R.id.textViewDesc);

        MenuItem menuItem = menuItems.get(position);

        textViewName.setText(menuItem.getName());
        textViewDesc.setText(menuItem.getDescription());

        return listViewItem;
    }
}

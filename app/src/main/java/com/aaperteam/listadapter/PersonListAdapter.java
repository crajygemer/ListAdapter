package com.aaperteam.listadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private static final String TAG = "PersonListAdapter";

    private Context mContext;
    int mResource;

    public PersonListAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull ArrayList<Person> objects) {
        super(context, resource, textViewResourceId, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        //get the person information
        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        //create the person object with the information
        Person person = new Person(name,birthday,sex);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView);
        TextView tvBirthday = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvSex = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);

        return convertView;
    }
}

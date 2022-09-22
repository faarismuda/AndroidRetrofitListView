package com.faarisid.tugasretrofitlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class Custom extends BaseAdapter {
    private ArrayList<Model>modelArrayList;
    private Context context;
    private int layout;

    //Generate constructor


    public Custom(ArrayList<Model> modelArrayList, Context context, int layout) {
        this.modelArrayList = modelArrayList;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //Create view holder inter class
    private class ViewHolder{
        TextView idtxt, nametxt, usernametxt, emailtxt, phonetxt, websitetxt;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(layout, null);

        //Id type casting
        viewHolder.idtxt=convertView.findViewById(R.id.idtxt);
        viewHolder.nametxt=convertView.findViewById(R.id.nametxt);
        viewHolder.usernametxt=convertView.findViewById(R.id.usernametxt);
        viewHolder.emailtxt=convertView.findViewById(R.id.emailtxt);
        viewHolder.phonetxt=convertView.findViewById(R.id.phonetxt);
        viewHolder.websitetxt=convertView.findViewById(R.id.websitetxt);

        //Set position
        Model model = modelArrayList.get(position);
        viewHolder.idtxt.setText(model.getId() + ". ");
        viewHolder.nametxt.setText(model.getName());
        viewHolder.usernametxt.setText("Username: " + model.getUsername());
        viewHolder.emailtxt.setText("Email: " + model.getEmail());
        viewHolder.phonetxt.setText("Phone: " + model.getPhone());
        viewHolder.websitetxt.setText("Website: " + model.getWebsite());
        return convertView;
    }
}

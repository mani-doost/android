package com.example.mani.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mshafaatdoost on 11/21/16.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {
    protected TextView vName;
    protected TextView vSurname;
    protected TextView vEmail;
    protected TextView vTitle;
    protected ImageView vImage;

    public ContactViewHolder(View v) {
        super(v);
        vImage = (ImageView)  v.findViewById(R.id.image);
        vName =  (TextView) v.findViewById(R.id.txtName);
        vSurname = (TextView)  v.findViewById(R.id.txtSurname);
        vEmail = (TextView)  v.findViewById(R.id.txtEmail);
        vTitle = (TextView) v.findViewById(R.id.title);
    }
}

package com.example.listviews;

import android.view.View;
import android.widget.RatingBar;

class ViewHolder {
    RatingBar rate=null;
    ViewHolder(View base) {
        this.rate=(RatingBar)base.findViewById(R.id.rate);
    }
}
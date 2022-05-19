package com.appnotification.notificationhistorylog.viewholder;


import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appnotification.notificationhistorylog.Interface.IItemClickListner;
import com.appnotification.notificationhistorylog.R;
import com.github.aakira.expandablelayout.ExpandableLinearLayout;


public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView txt_item, txt_child;
    public RelativeLayout button;
    public ExpandableLinearLayout expandableLinearLayout;

    IItemClickListner iItemClickListner;

    public void setiItemClickListner(IItemClickListner iItemClickListner){
        this.iItemClickListner = iItemClickListner;
    }

    public ItemViewHolder(@NonNull View itemView, boolean isExpandable) {
        super(itemView);

        if (!isExpandable){
            txt_item = (TextView)itemView.findViewById(R.id.txt_item_text);
            txt_child = (TextView)itemView.findViewById(R.id.txt_child_item_text);
            button = (RelativeLayout)itemView.findViewById(R.id.buttonrl);
            expandableLinearLayout = (ExpandableLinearLayout)itemView.findViewById(R.id.explayout);

        }
        else {
            txt_item = (TextView)itemView.findViewById(R.id.txt_item_text);
            txt_child = (TextView)itemView.findViewById(R.id.txt_child_item_text);
            button = (RelativeLayout)itemView.findViewById(R.id.buttonrl);
            expandableLinearLayout = (ExpandableLinearLayout)itemView.findViewById(R.id.explayout);


        }

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iItemClickListner.onClick(view,getAdapterPosition());
            }
        });
    }

}

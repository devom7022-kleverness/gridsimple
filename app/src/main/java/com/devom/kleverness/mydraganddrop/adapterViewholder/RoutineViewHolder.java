package com.devom.kleverness.mydraganddrop.adapterViewholder;

import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.devom.kleverness.mydraganddrop.R;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractDraggableItemViewHolder;

public class RoutineViewHolder extends AbstractDraggableItemViewHolder {
    public CardView mContainer;
    public TextView mTextView;

    public RoutineViewHolder(View v) {
        super(v);
        mContainer = v.findViewById(R.id.item_scene);
        mTextView = v.findViewById(R.id.tv_scene_name);
    }
}
package com.company;

public class Button {

    OnClickListener listener;

    public void click() {
        listener.onClick();
    }

    public void setOnClickListener(OnClickListener onClickListener){
    this.listener = onClickListener;

    }

    interface OnClickListener {
        void onClick();

    }

}

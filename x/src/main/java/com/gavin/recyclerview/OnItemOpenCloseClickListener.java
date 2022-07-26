package com.gavin.recyclerview;


public interface OnItemOpenCloseClickListener {

    /**
     * item 左右菜单开闭状态
     *
     * @param swipeMenuLayout
     * @param adapterPosition
     */

    void onItemOpenCloseStatus(SwipeMenuLayout swipeMenuLayout, int adapterPosition);

}

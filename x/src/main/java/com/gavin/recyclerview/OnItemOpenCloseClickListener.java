package com.gavin.recyclerview;


public interface OnItemOpenCloseClickListener {

    /**
     * item 左右菜单开闭状态
     *
     * @param swipeMenuLayout
     * @param adapterPosition
     */

    void onItemOpenCloseStatus(boolean showLeftCloseRight,SwipeMenuLayout swipeMenuLayout, int adapterPosition);

}

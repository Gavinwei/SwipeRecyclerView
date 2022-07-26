package com.gavin.recyclerview;


public interface OnItemOpenCloseClickListener {

    /**
     * item 左右菜单开闭状态
     *
     * @param moveOrNot
     * @param adapterPosition
     */

    void onItemOpenCloseStatus(boolean moveOrNot, int adapterPosition, boolean showRight);

}

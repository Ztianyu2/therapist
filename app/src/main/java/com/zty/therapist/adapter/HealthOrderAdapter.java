package com.zty.therapist.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.zty.therapist.R;
import com.zty.therapist.model.ProductOrderModel;
import com.zty.therapist.recycler.FooterRefreshAdapter;

/**
 * Created by zty on 2016/12/27.
 */

public class HealthOrderAdapter extends FooterRefreshAdapter<ProductOrderModel> {

    public HealthOrderAdapter(Context context) {
        super(context);
    }


    @Override
    protected void convert(RecyclerView.ViewHolder holder, ProductOrderModel productOrderModel) {

    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_product_order;
    }
}

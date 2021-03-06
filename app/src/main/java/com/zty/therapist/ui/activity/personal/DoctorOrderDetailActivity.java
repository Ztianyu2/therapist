package com.zty.therapist.ui.activity.personal;

import android.view.View;

import com.zty.therapist.R;
import com.zty.therapist.base.BaseActivity;

/**
 * Created by zty on 2016/12/29.
 */

public class DoctorOrderDetailActivity extends BaseActivity {
    @Override
    protected int getContentView() {
        return R.layout.activity_doctor_detail;
    }

    @Override
    protected void initData() {
        title.setText("订单详情");
        left.setBackgroundResource(R.mipmap.ic_back);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        right.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onFailureCallback(int requestCode, String errorMsg) {

    }

    @Override
    public void onSuccessCallback(int requestCode, String response) {

    }
}

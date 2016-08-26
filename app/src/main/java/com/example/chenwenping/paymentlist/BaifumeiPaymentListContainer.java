package com.example.chenwenping.paymentlist;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

/**
 * Created by chenwenping on 16/8/6.
 */
public class BaifumeiPaymentListContainer extends LinearLayout {

    public BaifumeiPaymentListContainer(Context context) {
        super(context);
    }

    public BaifumeiPaymentListContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected int getListViewLayout() {
        return R.layout.purse_mogujie_balancedue_item;
    }

    protected View newBillListView() {
        View billListView = View.inflate(getContext(), getListViewLayout(), null);

       // RadioButton radioButton = (RadioButton) billListView.findViewById(R.id.baifumei_seleting_btn);

        return billListView;

    }

    public void baifumeiBillListContainerInit(int count) {

        View billListView;

        for(int i = 0 ;i < count; i++) {
            billListView = newBillListView();
            addView(billListView);
        }

        for (int i=0; i< getChildCount(); i++) {
            View view = getChildAt(i);

            if (i != getChildCount() - 1) {
                LinearLayout.LayoutParams rowLayoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                rowLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 10, Resources.getSystem().getDisplayMetrics());
                view.setLayoutParams(rowLayoutParams);
            }
        }

    }
}

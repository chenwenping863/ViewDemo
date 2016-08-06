package com.example.chenwenping.paymentlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private BaifumeiPaymentListContainer  mBaifumeiPaymentListContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBaifumeiPaymentListContainer = (BaifumeiPaymentListContainer) findViewById(R.id.baidumei_payment_list_container_id);
        mBaifumeiPaymentListContainer.baifumeiBillListContainerInit(3);
    }

}

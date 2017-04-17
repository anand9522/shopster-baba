package com.think.shopster;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by anand on 18/04/17.
 */

public class ProductList extends AppCompatActivity {
    private ListView productList;
    private ProductAdapter productAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.product_list_view);
        ArrayList<ProductData> productDatas= (ArrayList<ProductData>) getIntent().getSerializableExtra("productList");
        productList=(ListView) findViewById(R.id.product_list);

        productAdapter= new ProductAdapter(getApplicationContext(),0,productDatas);
        productList.setAdapter(productAdapter);
        System.out.println("Sab Badhiya");


    }


}

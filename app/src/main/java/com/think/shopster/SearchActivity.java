package com.think.shopster;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anand on 16/04/17.
 */

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {


    private Button searchButton;
    private TextView searchText;
    private String url="http://shopster.96.It/result5.php?q=";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        searchButton = (Button) findViewById(R.id.search);
        searchText = (EditText) findViewById(R.id.search_text);
        searchButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.search){
            String query=url+searchText.getText();
            new FetchData().execute(query);
        }
    }

    public class FetchData extends AsyncTask<String,Void,ArrayList<ProductData>>{

        @Override
        protected ArrayList<ProductData> doInBackground(String... params) {
            return null;
        }
    }


}

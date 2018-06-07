package com.example.deepakrattan.recyclerviewwithcardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    android.support.v7.widget.RecyclerView rv;
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager;
     private SingleRow singleRow;
    private java.util.ArrayList<SingleRow> singleRowArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewByID
        rv = (android.support.v7.widget.RecyclerView) findViewById(R.id.rv);
        layoutManager = new android.support.v7.widget.LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        String[] name = {"Raj", "Ravi", "Ashok", "Vikas", "Sandeep", "Raj", "Ravi", "Ashok", "Vikas", "Sandeep"};
        String[] designation = {"Developer", "Tester", "Designer", "Manager", "HR", "Developer", "Tester", "Designer", "Manager", "HR"};
        int[] image = {R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1, R.drawable.image1};

        singleRowArrayList = new java.util.ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            singleRow = new SingleRow(image[i], name[i], designation[i]);
            singleRowArrayList.add(singleRow);
        }

        MyAdapter adapter = new MyAdapter(this, singleRowArrayList);
        rv.setAdapter(adapter);
    }
}

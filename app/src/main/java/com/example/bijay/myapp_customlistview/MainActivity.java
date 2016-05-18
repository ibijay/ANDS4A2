package com.example.bijay.myapp_customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] phoneList = new String[] { "Bijay Kumar Swain | +91 8658960768","Hritik Roshan | +22 9955334400","Akshay Kumar | +22 7530039900",
                "John Abraham | +22 8866447788","Sylvester Stallon | +1 11753045231","Tom Cruise | +1 18754896133"};

        ArrayAdapter<String> arrayAdapterPhoneList = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, phoneList);
        ListView listViewPhoneList = (ListView)findViewById(R.id.listView);

        listViewPhoneList.setAdapter(arrayAdapterPhoneList);
    }
}
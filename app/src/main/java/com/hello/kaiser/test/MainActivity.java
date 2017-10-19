package com.hello.kaiser.test;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_send;
    private MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_send = (Button) findViewById(R.id.button);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transation = manager.beginTransaction();
        myFragment = new MyFragment();
        transation.add(R.id.layout_container_fragment, myFragment);
        transation.commit();


        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFragment.refreshData();
            }
        });
    }
}












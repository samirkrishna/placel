package com.hasi.samirkrishna.placefinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Help extends AppCompatActivity {

    ListView lview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Intent[] chooser = new Intent[1];

        lview = findViewById(R.id.lview);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("mailto:"));
                String[] to={"saiganesh7092@gmail.com","Birdhurajudarahasini@gmail.com"};
                i.putExtra(Intent.EXTRA_EMAIL,to);
                i.setType("message/rfc822");
                chooser[0] =Intent.createChooser(i,"send mail");
                startActivity(chooser[0]);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<String> values =new ArrayList<>();
        values.add("More");
        values.add("Guide");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,values);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent i =new Intent(Help.this,More.class);
                    startActivity(i);
                }
                if(position==1)
                {
                    Intent i =new Intent(Help.this,Guide.class);
                    startActivity(i);
                }
            }
        });

        lview.setAdapter(adapter);
    }

}

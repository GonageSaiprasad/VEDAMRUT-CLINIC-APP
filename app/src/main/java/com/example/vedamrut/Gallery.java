package com.example.vedamrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Gallery extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        gridView =(GridView) findViewById(R.id.gridview);
        gridView.setAdapter( new ImageAdapter( this ) );

        gridView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent= new Intent( getApplicationContext(),fullscreen.class );
                intent.putExtra("id",position);
                startActivity( intent );
            }
        } );

    }
}

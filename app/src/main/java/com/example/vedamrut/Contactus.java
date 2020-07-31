package com.example.vedamrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import javax.security.auth.Subject;

public class Contactus extends AppCompatActivity {
    ImageView imgphone,imgmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        imgmail=findViewById(R.id.mail);
        imgphone=findViewById(R.id.contactno);

        imgphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 9820896040"));
                Toast.makeText( Contactus.this,"Dial" ,Toast.LENGTH_SHORT).show();
                startActivity( intent );
            }
        });

        imgmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
               intent.setData(Uri.parse("mailto:"));
               intent.setType("text/plain");
               intent.putExtra(Intent.EXTRA_SUBJECT, new String());
               intent.putExtra(Intent.EXTRA_TEXT, new String());
                startActivity(intent);
            }
        });

    }
}

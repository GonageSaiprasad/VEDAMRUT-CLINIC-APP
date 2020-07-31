package com.example.vedamrut;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView cardgallery,carddocter,cardcenter,cardtreatment,cardtestimonial,cardproduct,cardfacilities,cardparshan,cardcontactus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardcenter=findViewById(R.id.center);
        carddocter=findViewById(R.id.doctor);
        cardtreatment=findViewById(R.id.treatment);
        cardtestimonial=findViewById(R.id.testimonial);
        cardgallery=findViewById(R.id.gallery);
        cardproduct=findViewById(R.id.product);
        cardfacilities=findViewById(R.id.facilities);
        cardparshan=findViewById(R.id.parshan);
        cardcontactus=findViewById(R.id.contactus);


        cardcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,Center.class );
                Toast.makeText( MainActivity.this,"Center" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        });

        carddocter.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,Docter.class );
                Toast.makeText( MainActivity.this,"Docter" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );

        cardtreatment.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,Panchakarmatretment.class );
                Toast.makeText( MainActivity.this,"Treatment" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );

        cardfacilities.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,facilities.class );
                Toast.makeText( MainActivity.this,"Facilities" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );

        cardtestimonial.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,Testimonial.class );
                Toast.makeText( MainActivity.this,"Testimonial" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );

        cardproduct.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,Product.class );
                Toast.makeText( MainActivity.this,"Product" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );

        cardcontactus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,Contactus.class );
                Toast.makeText( MainActivity.this,"Contact Us" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );

        cardparshan.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,parshan.class );
                Toast.makeText( MainActivity.this,"Suvarnprashan" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );

        cardgallery.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent( MainActivity.this,Gallery.class );
                Toast.makeText( MainActivity.this,"Gallery" ,Toast.LENGTH_SHORT).show();
                startActivity( i );
            }
        } );
    }
    @Override
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder( this );
         alertDialogBuilder.setTitle( "Confirm Exit" );
        alertDialogBuilder.setIcon( R.drawable.ic_exit_to_app_black_24dp );
        alertDialogBuilder.setMessage( "Are you sure you want to exit" );
        alertDialogBuilder.setCancelable( false );

        alertDialogBuilder.setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        } );

        alertDialogBuilder.setNegativeButton( "No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText( MainActivity.this,"You Click On Cancel",Toast.LENGTH_LONG ).show();
            }
        } );
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

}


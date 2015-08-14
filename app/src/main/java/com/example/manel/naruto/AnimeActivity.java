package com.example.manel.naruto;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Manel on 01/08/2015.
 */
public class AnimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        final AlertDialog.Builder b = new AlertDialog.Builder(AnimeActivity.this,AlertDialog.THEME_HOLO_DARK);
        b.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });

        b.setMessage("- PARA MAS INFO SOBRE LA SERIE, MANTENER PULSADO ENCIMA DE ELLA.\n" +
                        "- NO DUDEN EN CONTACTAR CONMIGO MEDIANTE EL BOTON E-MAIL.\n\n" +
                        "DISFRUTA DE LA EXPERIENCIA ANIME!");
        b.create().show();

        ImageView ib1 = (ImageView) findViewById(R.id.b1);
        ImageView ib2 = (ImageView) findViewById(R.id.b2);
        ImageView ib3 = (ImageView) findViewById(R.id.b3);
        ImageView ib4 = (ImageView) findViewById(R.id.b4);
        ImageView ib5 = (ImageView) findViewById(R.id.b5);

        ib1.setImageResource(R.drawable.narutonormalll);
        ib2.setImageResource(R.drawable.narutoshippuden);
        ib3.setImageResource(R.drawable.bleach);
        ib4.setImageResource(R.drawable.evalogo);
        //ib5.setImageResource(R.drawable.conan);


        ib1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                b.setTitle("NARUTO");
                b.setMessage(R.string.naruto);
                b.show();
                return true;

            }
        });
        ib2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                b.setTitle("NARUTO SHIPPUDEN");
                b.setMessage(R.string.naruto_shippuden);
                b.show();
                return true;
            }
        });
        ib3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                b.setTitle("BLEACH");
                b.setMessage(R.string.bleach);
                b.show();
                return true;
            }
        });
        ib4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                b.setTitle("EVANGELION");
                b.setMessage(R.string.evangelion);
                b.show();
                return true;
            }
        });
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ChaptersActivity.class);
                i.putExtra("NARUTO", "NARUTO");
                startActivity(i);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ChaptersActivity.class);
                i.putExtra("NARUTO SHIPPUDEN","NARUTO SHIPPUDEN");
                startActivity(i);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ChaptersActivity.class);
                i.putExtra("BLEACH","BLEACH");
                startActivity(i);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ChaptersActivity.class);
                i.putExtra("EVANGELION","EVANGELION");
                startActivity(i);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ChaptersActivity.class);
                i.putExtra("CONAN", "CONAN");
                startActivity(i);
            }
        });

        ImageButton fb = (ImageButton) findViewById(R.id.fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "manel.00@hotmail.com",null));
                startActivity(intent);
            }
        });
    }
}

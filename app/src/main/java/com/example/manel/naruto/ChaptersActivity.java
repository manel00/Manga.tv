package com.example.manel.naruto;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ChaptersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        final Bundle b = getIntent().getExtras();
        final ListView cap = (ListView) findViewById(R.id.capituloslv);
        final ArrayList<String> al = new ArrayList<>();
        cap.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        if (b.getString("NARUTO") != null) {
            for (int i = 1; i < 221; i++) {
                al.add(getString(R.string.naruto_chapters) + i);
            }
        } else if (b.get("NARUTO SHIPPUDEN") != null) {
            for (int i = 1; i < 424; i++) {
                al.add(getString(R.string.naruto_shippuden_chapters) + i);
            }
        }else if (b.get("BLEACH") != null) {
            for (int i = 1; i < 367; i++) {
                al.add(getString(R.string.bleach_chapters) + i);
            }
        } else if (b.get("EVANGELION") != null) {
            for (int i = 1; i < 27; i++) {
                al.add(getString(R.string.eva) + i);
            }
        } else if (b.get("CONAN") != null) {
            for (int i = 1; i < 328; i++) {
                al.add(getString(R.string.conan) + i);
            }
        }
        final ArrayAdapter<String> aa = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                al);
        cap.setAdapter(aa);

        cap.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    DecimalFormat df = new DecimalFormat("00");

                    if (b.getString("NARUTO") != null) {
                        for (int i = 1; i < 221; i++) {
                            if ((position + 1) == i) {
                                Intent intent = new Intent (Intent.ACTION_VIEW,
                                        Uri.parse(getString(R.string.narutourl) + df.format(i) + "-sub-espanol"));
                                startActivity(intent);
                            }
                        }
                    } else if (b.getString("NARUTO SHIPPUDEN") != null) {
                        for (int i = 1; i < 424; i++) {
                            if ((position + 1) == i) {
                                Intent intent = new Intent (Intent.ACTION_VIEW,
                                        Uri.parse(getString(R.string.narutoshippurl) + i));
                                startActivity(intent);
                            }
                        }
                    } else if (b.getString("BLEACH") != null) {
                        for (int i = 1; i < 367; i++) {
                            if ((position + 1) == i) {
                                Intent intent = new Intent (Intent.ACTION_VIEW,
                                        Uri.parse(getString(R.string.bleachurl) + i));
                                startActivity(intent);
                            }
                        }
                    } else if (b.getString("EVANGELION") != null) {
                        for (int i = 1; i < 27; i++) {
                            if ((position + 1) == i) {
                                Intent intent = new Intent (Intent.ACTION_VIEW,
                                        Uri.parse(getString(R.string.evangelionurl) + df.format(i) + ".html"));
                                startActivity(intent);
                            }
                        }
                    } else if (b.getString("CONAN") != null) {
                        for (int i = 1; i < 328; i++) {
                            if ((position + 1) == i) {
                                Intent intent = new Intent (Intent.ACTION_VIEW,
                                        Uri.parse(getString(R.string.conanurl) + df.format(i) + "-espanol-el.html"));
                                startActivity(intent);
                            }
                        }
                    }
                }
        });
    }
}
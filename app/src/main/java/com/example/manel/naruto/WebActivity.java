package com.example.manel.naruto;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Manel on 24/07/2015.
 */
public class WebActivity extends Activity {

    String url = "http://m.reyanime.com/capitulo/naruto-54";
    protected WebView wv;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        wv = (WebView) findViewById(R.id.webview);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.setWebChromeClient(new WebChromeClient());
        wv.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (!url.contains(url)){
                    view.loadUrl(url);
                }
                return true;
            }});

    wv.getSettings().setJavaScriptEnabled(true);
    wv.loadUrl(url);

        /*

        Bundle b = getIntent().getExtras();

        String NarutoUrl = "http://jkanime.net/naruto/";
        String BleachUrl = "http://jkanime.net/bleach/";
        String NarutoShippudenUrl = "http://jkanime.net/naruto-shippuden/";

        if (b.get("NARUTO")!= null) {
                Intent intent = new Intent (Intent.ACTION_VIEW,
                        Uri.parse(NarutoUrl+b.get("NARUTO")));
                startActivity(intent);
        } if (b.get("NARUTO SHIPPUDEN")!= null) {
            Intent intent = new Intent (Intent.ACTION_VIEW,
                    Uri.parse(NarutoShippudenUrl+b.get("NARUTO SHIPPUDEN")));
            startActivity(intent);
        } if (b.get("BLEACH")!= null) {
            Intent intent = new Intent (Intent.ACTION_VIEW,
                    Uri.parse(BleachUrl+b.get("BLEACH")));
            startActivity(intent);
        }*/
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && wv.canGoBack()) {
            wv.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
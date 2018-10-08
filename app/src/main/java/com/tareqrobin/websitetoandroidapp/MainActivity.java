package com.tareqrobin.websitetoandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wv;
    //private Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=(WebView)findViewById(R.id.webv);
        //tb=(Toolbar)findViewById(R.id.toolbar);

        WebSettings webSettings= wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("https://www.tutorialspoint.com");
        wv.setWebViewClient(new WebViewClient());

        //setSupportActionBar(tb);
        //getSupportActionBar().setTitle("My Browser");


    }
    @Override
    public void onBackPressed(){
        if(wv.canGoBack()){
            wv.goBack();
        }
        else {
        super.onBackPressed();
    }

    }
}

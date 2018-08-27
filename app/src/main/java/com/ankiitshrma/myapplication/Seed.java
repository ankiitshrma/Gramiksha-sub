package com.ankiitshrma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Seed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_seed);
        WebView seed = findViewById(R.id.webviewseed);
        seed.getSettings().setJavaScriptEnabled(true);
        seed.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                view.loadUrl("javascript:(function() { " +
                        "var head = document.getElementsByClassName('cd-header')[0].style.display='none'; " +
                        "var head = document.getElementsByClassName('footer')[0].style.display='none'; " +
                        "})()");
            }
        });
        seed.loadUrl("https://gramiksha.in/project/seed");
    }
}

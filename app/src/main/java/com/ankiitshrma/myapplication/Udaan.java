package com.ankiitshrma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.asksira.webviewsuite.WebViewSuite;
import android.graphics.Bitmap;

public class Udaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaan);
               WebViewSuite webViewSuite;
        webViewSuite = (WebViewSuite) findViewById(R.id.webViewSuite);

        webViewSuite.customizeClient(new WebViewSuite.WebViewSuiteCallback() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {

            }

            @Override
            public void onPageFinished(WebView view, String url) {

            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        /*
        WebView udaan = findViewById(R.id.webview);
        udaan.getSettings().setJavaScriptEnabled(true);
        udaan.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                view.loadUrl("javascript:(function() { " +
                        "var head = document.getElementsByClassName('cd-header')[0].style.display='none'; " +
                        "var head = document.getElementsByClassName('footer')[0].style.display='none'; " +
                        "})()");
            }
        });
        udaan.loadUrl("http://www.gramiksha.in/project/udaan");
        */
    }
}

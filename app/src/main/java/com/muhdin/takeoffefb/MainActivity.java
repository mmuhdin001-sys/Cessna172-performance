package com.muhdin.takeoffefb;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Color;

public class MainActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);

        webView.setBackgroundColor(Color.WHITE);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        webView.loadUrl("file:///android_asset/index.html");

        setContentView(webView);
    }
}

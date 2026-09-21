package com.muhdin.takeoffefb;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);

            WebView webView = new WebView(this);
            webView.setWebViewClient(new WebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);

            webView.loadUrl("file:///android_asset/index.html");

            setContentView(webView);

        } catch (Exception e) {
            TextView error = new TextView(this);
            error.setTextColor(Color.RED);
            error.setTextSize(16);
            error.setPadding(30, 30, 30, 30);
            error.setText("APP ERROR:\\n\\n" + e.toString());
            setContentView(error);
        }
    }
}

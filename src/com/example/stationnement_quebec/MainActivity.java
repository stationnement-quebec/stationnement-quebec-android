package com.example.stationnement_quebec;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		WebView webView = (WebView) findViewById(R.id.webView);
		webView.setWebViewClient(new WebViewClient());
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		// you can load an URL
		webView.loadUrl("http://192.241.251.196/");
	}

}

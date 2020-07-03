package com.amon.seasoncoffee02;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.uri.Uri;
import com.yandex.mapkit.user_location.UserLocationLayer;

//ТУТ раболчая модель с двумя точками и тостами
public class Places extends AppCompatActivity  implements View.OnClickListener {

    ImageButton arrowBackButton;
    private MapView mapview;
    private UserLocationLayer userLocationLayer;
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey("6ded8cc8-77b1-4827-9607-b3529f53e092");
        MapKitFactory.initialize(this);
        setContentView(R.layout.places);

        arrowBackButton = findViewById(R.id.arrowBack);
        arrowBackButton.setOnClickListener(this);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.coffeesplash);

        mapview = (MapView) findViewById(R.id.mapview);
        mapview.getMap().setRotateGesturesEnabled(false);
        mapview.getMap().move(new CameraPosition(new Point(55.888821, 37.587826), 14, 0, 0));
        MapKit mapKit = MapKitFactory.getInstance();
        userLocationLayer = mapKit.createUserLocationLayer(mapview.getMapWindow());
        userLocationLayer.setVisible(true);
        userLocationLayer.setHeadingEnabled(true);

        webView = findViewById(R.id.webView);
        // включаем поддержку JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        // указываем страницу загрузки
        webView.loadUrl("https://yandex.ru/maps/?um=constructor%3A443e0eb0029c4c7a7acc2f6aa17e1c647f7d8946d7da2943a086e77137f76419&source=constructorLink");
        webView.setWebViewClient(new MyWebViewClient());
    }


    @Override
    protected void onStop() {
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        MapKitFactory.getInstance().onStart();
        mapview.onStart();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.arrowBack:
                Intent intent = new Intent(this, ArrowBack.class);
                startActivity(intent);
                break;
        }
    }

    private class MyWebViewClient extends WebViewClient {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

        // Для старых устройств
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

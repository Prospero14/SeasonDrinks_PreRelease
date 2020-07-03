/*package com.amon.seasoncoffee02;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.layers.ObjectEvent;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.search.SearchOptions;
import com.yandex.mapkit.search.Session;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.mapkit.user_location.UserLocationObjectListener;
import com.yandex.mapkit.user_location.UserLocationView;
import com.yandex.runtime.image.ImageProvider;

public class PlacesTest extends AppCompatActivity implements View.OnClickListener, UserLocationObjectListener {
    ImageButton arrowBackButton;
    private MapView mapview;
    private UserLocationLayer userLocationLayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey("6ded8cc8-77b1-4827-9607-b3529f53e092");
        MapKitFactory.initialize(this);
        setContentView(R.layout.places);
        arrowBackButton = findViewById(R.id.arrowBack);
        arrowBackButton.setOnClickListener(this);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logotoplast);
        mapview = (MapView) findViewById(R.id.mapview);
        mapview.getMap().setRotateGesturesEnabled(false);
        mapview.getMap().move(new CameraPosition(new Point(0, 0), 14, 0, 0));
        MapKit mapKit = MapKitFactory.getInstance();
        userLocationLayer = mapKit.createUserLocationLayer(mapview.getMapWindow());
        userLocationLayer.setVisible(true);
        userLocationLayer.setHeadingEnabled(true);

        userLocationLayer.setObjectListener(this);
    }
    @Override
    public void onObjectAdded(UserLocationView userLocationView) {
        userLocationLayer.setAnchor(
                new PointF((float)(mapview.getWidth() * 0.5), (float)(mapview.getHeight() * 0.5)),
                new PointF((float)(mapview.getWidth() * 0.5), (float)(mapview.getHeight() * 0.83)));

        userLocationView.getArrow().setIcon(ImageProvider.fromResource(
                this, R.drawable.user_arrow));


        userLocationView.getAccuracyCircle().setFillColor(Color.BLUE);
    }

    @Override
    public void onObjectRemoved(UserLocationView view) {
    }

    @Override
    public void onObjectUpdated(UserLocationView view, ObjectEvent event) {
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapview.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapview.onStart();
        MapKitFactory.getInstance().onStart();

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

    public Session resolveURI (@NonNull String uri, @NonNull SearchOptions searchOptions, @NonNull Session.SearchListener searchListener){
        return
    }
}


*/
/*package com.amon.seasoncoffee02;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.user_location.UserLocationLayer;
 //ТУТ раболчая модель с двумя точками и тостами
public class Places extends AppCompatActivity implements View.OnClickListener {
    ImageButton arrowBackButton;
    private MapView mapview;
    private UserLocationLayer userLocationLayer;
    private final Point CIRCLE_CENTER = new Point(55.891345, 37.585485);
    private final Point CIRCLE_CENTER_DB = new Point(55.889002, 37.588109);
    private final Point CIRCLE_CENTER_SB = new Point(53.891345, 37.585485);

    private MapObjectCollection mapObjects;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey("6ded8cc8-77b1-4827-9607-b3529f53e092");
        MapKitFactory.initialize(this);
        setContentView(R.layout.places);

        arrowBackButton = findViewById(R.id.arrowBack);
        arrowBackButton.setOnClickListener(this);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logotoplast);

        mapview = (MapView) findViewById(R.id.mapview);
        mapview.getMap().setRotateGesturesEnabled(false);
        mapview.getMap().move(new CameraPosition(new Point(55.888821, 37.587826), 14, 0, 0));
        MapKit mapKit = MapKitFactory.getInstance();
        userLocationLayer = mapKit.createUserLocationLayer(mapview.getMapWindow());
        userLocationLayer.setVisible(true);
        userLocationLayer.setHeadingEnabled(true);
        mapObjects = mapview.getMap().getMapObjects().addCollection();
        animationHandler = new Handler();
        createMapObjects();

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

    private void createMapObjects() {
        createTappableCircle();
    }

    private MapObjectTapListener circleMapObjectTapListener = new MapObjectTapListener() {
        @Override
        public boolean onMapObjectTap(MapObject mapObject, Point point) {
            if (mapObject instanceof CircleMapObject) {
                CircleMapObject circle = (CircleMapObject) mapObject;

                float randomRadius = 20.0f;

                Circle curGeometry = circle.getGeometry();
                Circle newGeometry = new Circle(curGeometry.getCenter(), randomRadius);
                circle.setGeometry(newGeometry);

                Object userData = circle.getUserData();
                if (userData instanceof Places.CircleMapObjectUserData) {
                    Toast toast = Toast.makeText(
                            getApplicationContext(),
                            "Кофейня Лакрица, средний чек 160₽",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            if (mapObject instanceof CircleMapObject) {
                CircleMapObject circleOne = (CircleMapObject) mapObject;

                float randomRadius = 20.0f;

                Circle curGeometry = circleOne.getGeometry();
                Circle newGeometry = new Circle(curGeometry.getCenter(), randomRadius);
                circleOne.setGeometry(newGeometry);

                Object userData = circleOne.getUserData();
                if (userData instanceof Places.CircleMapObjectUserData) {
                    Toast toast = Toast.makeText(
                            getApplicationContext(),
                            "Кофейня Мыльница, средний чек 1600₽",
                            Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            return true;
        }
    };


    private class CircleMapObjectUserData {
        final int id;
        final String description;

        CircleMapObjectUserData(int id, String description) {
            this.id = id;
            this.description = description;
        }
    }

    private void createTappableCircle() {
        CircleMapObject circle = mapObjects.addCircle(
                new Circle(CIRCLE_CENTER, 10), Color.LTGRAY, 2, Color.DKGRAY);
        circle.setZIndex(20.0f);
        circle.setUserData(new CircleMapObjectUserData(42, "Tappable circle"));
        // Client code must retain strong reference to the listener.
        circle.addTapListener(circleMapObjectTapListener);
        CircleMapObject circleOne = mapObjects.addCircle(
                new Circle(CIRCLE_CENTER_DB, 10), Color.LTGRAY, 2, Color.DKGRAY);
        circleOne.setZIndex(20.0f);
        circleOne.setUserData(new CircleMapObjectUserData(42, "Tappable circle"));
        // Client code must retain strong reference to the listener.
        circleOne.addTapListener(circleMapObjectTapListener);
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

}


*/
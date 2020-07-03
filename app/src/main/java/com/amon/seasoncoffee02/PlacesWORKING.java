/*public class Places extends AppCompatActivity implements View.OnClickListener {
    ImageButton arrowBackButton;
    private MapView mapview;
    private UserLocationLayer userLocationLayer;
    private final Point CIRCLE_CENTER = new Point(55.888729, 37.584437);
    private final Point CIRCLE_CENTER_DB = new Point(55.889173, 37.591012);
    private final Point CIRCLE_CENTER_SB = new Point(55.894929, 37.588585);
    private final Point CIRCLE_CENTER_KK = new Point(55.897101, 37.588444);

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

        PlacemarkMapObject NotSb = mapObjects.addPlacemark(CIRCLE_CENTER);
        PlacemarkMapObject Sb = mapObjects.addPlacemark(CIRCLE_CENTER_DB);
        PlacemarkMapObject Bb = mapObjects.addPlacemark(CIRCLE_CENTER_SB);
        PlacemarkMapObject KK = mapObjects.addPlacemark(CIRCLE_CENTER_KK);
        NotSb.setOpacity(0.5f);
        Sb.setOpacity(0.5f);
        Bb.setOpacity(0.5f);
        KK.setOpacity(0.5f);
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
}

*/
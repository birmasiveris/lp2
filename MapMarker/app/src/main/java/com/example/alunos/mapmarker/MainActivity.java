package com.example.alunos.mapmarker;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.health.PackageHealthStats;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnShowLocation;
    Button btnShowOnMap;
    TextView latitudeField;
    TextView longitudeField;
    private static final int REQUEST_CODE_PERMISSION = 2;
    String mPermission = Manifest.permission.ACCESS_FINE_LOCATION;
    //GPSTracker
    GPSTracker​ gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            if (ActivityCompat.checkSelfPermission(this, mPermission) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, new String[] {mPermission}, REQUEST_CODE_PERMISSION);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        btnShowLocation = (Button) findViewById(R.id.butShowLocation);
        btnShowOnMap = (Button) findViewById(R.id.butShowOnMap);
        latitudeField = (TextView) findViewById(R.id.latField);
        longitudeField = (TextView) findViewById(R.id.longField);

        btnShowOnMap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent it = new Intent (MainActivity.this, MapsActivity.class);
                startActivity(it);
            }
        });

        btnShowLocation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //create class object
                gps = new GPSTracker​(MainActivity.this);

                //check if GPS enabled
                if (gps.canGetLocation()){
                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    latitudeField.setText(String.valueOf(latitude));
                    longitudeField.setText(String.valueOf(longitude));
                }
                else{
                    //can't get location
                    //GPS or Network isn't enabled
                    //Ask user to enable GPS/Netwok in settings
                    latitudeField.setText("Não disponível");
                    longitudeField.setText("Não disponível");
                    gps.showSettingsAlert();
                }
            }
        });
    }
}

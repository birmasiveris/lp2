package com.example.alunos.mapmarker;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by alunos on 11/10/17.
 */

public class GPSTracker extends Service implements LocationListener{

    private final Context mContext;
    boolean isGPSEnabled = false; //flag do status do GPS
    boolean isNetworkEnabled = false; //flag do status da rede
    boolean canGetLocation = false; //flag do status do servico
    Location location; //objeto que guarda os dados da localizacao
    double latitude; //latitude
    double longitude; //longitude

    //Distancia minima em metros para atualizar a posicao
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10; //10 metros

    //Tempo minimo a ser esperado entre atualizacoes consecutivas
    private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1; //1 minuto

    //Declarando o Location Manager
    protected LocationManager locationManager;

    public GPSTracker(Context mContext){
        this.mContext = mContext;
        getLocation();
    }

    public Location getLocation() {
        try {
            locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);

            //Pega o status do GPS
            isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

            //Pega o status da rede
            isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

            if (!isGPSEnabled && !isNetworkEnabled) {
                //sem informacoes de posicao
            } else {
                this.canGetLocation = true;
                //primeiro, tentamos pegar a posicao pela rede
                if (isNetworkEnabled) {
                    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                    Log.d("Rede", "Rede");
                    if (locationManager != null) {
                        location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            latitude = location.getLatitude();
                            longitude = location.getLongitude();
                        }
                    }
                }

                //Se o GPS estiver habilitado, atualizamos a informacao por ele
                if (isGPSEnabled) {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_BW_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                    Log.d("GPS Ativo", "GPS Ativo");
                    if (locationManager != null) {
                        latitude = location.getLatitude();
                        longitude = location.getLongitude();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Retornamos o objeto
        return location;
    }

    public void stopUsingGPS(){
        if (locationManager != null){
            locationManager.removeUpdates(GPSTracker.this);
        }
    }

    public double getLatitude (){
        if (location != null){
            latitude = location.getLatitude();
        }
        return latitude;
    }

    public double getLongitude(){
        if (location != null){
            longitude = location.getLongitude();
        }
        return longitude;
    }

    //checa se o GPS/rede estao habilitados
    public boolean canGetLocation(){
        return this.canGetLocation;
    }

    //Caso o GPS e o wifi estejam desabilitados, mostra um alerta para que o usuario os habilite
    public void showSettingsAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
        //Setting dialog title
        alertDialog.setTitle("Configuracao de GPS");
        //Setting dialog message
        alertDialog.setMessage("O GPS nao esta ativo. Deseja ir para as configuracoes ativa-lo?");
        //On pressing Settings button
        alertDialog.setPositiveButton("Configuracoes", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                mContext.startActivity(intent);
            }
        });

        //on pressing cancel button
        alertDialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
            public void onClick (DialogInterface dialog, int which){
                dialog.cancel();
            }
        });

        //Showing Alert Message
        alertDialog.show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}

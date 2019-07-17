package com.b2t1.churchpalm;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.b2t1.churchpalm.parser.DataParser;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Map<Integer, List<LatLng>> locations = new HashMap<Integer, List<LatLng>>();
        locations = new DataParser().parse(getApplication());

        for(int i = 1; i <= 3; i++){
            if(locations.get(i) != null){
                for(int j = 0; j < locations.get(i).size(); j++){
                    addMarker(locations.get(i).get(j),i);
                }
            }
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-8.055368, -34.870393), 12));






    }


    public void addMarker(LatLng latLng, int category){
        MarkerOptions marker = new MarkerOptions();
        marker.position(latLng);
        if(category ==1){
            marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));

        } else if( category ==2){
            marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));

        }else if( category ==3){
            marker.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        }
        mMap.addMarker(marker);

    }
}

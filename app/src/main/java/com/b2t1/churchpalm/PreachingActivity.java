package com.b2t1.churchpalm;

import android.os.Bundle;

import com.b2t1.churchpalm.adapter.AdapterPreaching;
import com.b2t1.churchpalm.entities.Preaching;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PreachingActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerPreaching;
    //private int[] images = {1, 2, 3, 4};
    private List<Preaching> listPreaching = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preaching);

        recyclerPreaching = findViewById(R.id.recyclerPreaching);

        this.createPreaching();

        AdapterPreaching adapterPreaching = new AdapterPreaching(listPreaching);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerPreaching.setLayoutManager(layoutManager);
        recyclerPreaching.setHasFixedSize(true);
        recyclerPreaching.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerPreaching.setAdapter(adapterPreaching);

        recyclerPreaching.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerPreaching,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Preaching preaching = listPreaching.get(position);
                            Toast.makeText(
                                    getApplicationContext(),
                                    "Item pressionado" + preaching.getTitulo(),
                                    Toast.LENGTH_SHORT
                            ).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {

                        }

                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        }
                    }
            )
        );

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void createPreaching(){

        Preaching preaching = new Preaching("Pregação Santa ceia","22/02/2018", R.drawable.biblia1);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Ser Ponte", "21/03/2018", R.drawable.biblia1);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Ser Ponte", "21/03/2018", R.drawable.biblia3);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Romanos 1", "28/04/2018", R.drawable.biblia4);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Ser Sal e Luz", "14/07/2018", R.drawable.biblia3);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Corpo, Alma e Espírito", "01/09/2018", R.drawable.biblia2);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Doação", "07/11/2018", R.drawable.biblia1);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Natal", "24/12/2018", R.drawable.biblia2);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre Comunhão", "14/04/2019", R.drawable.biblia3);
        this.listPreaching.add(preaching);

        preaching = new Preaching("Pregação Sobre A Cruz Vazia", "30/06/2019", R.drawable.biblia4);
        this.listPreaching.add(preaching);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.preaching, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

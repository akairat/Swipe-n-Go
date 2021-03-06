package com.team_scream_mit.scream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    private App parseApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        parseApp = (App) getApplication();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.create_event) {
            Intent i = new Intent(this, AddEventActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.change_preferences){
            Intent i = new Intent(this, PreferencesActivity.class);
            startActivity(i);
            return true;
        } else if (id == R.id.about){
            return true;
        } else if (id == R.id.logout){
            parseApp.signOutFromGplus();
            finish();
            return true;
        } else if (id == R.id.main_screen){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

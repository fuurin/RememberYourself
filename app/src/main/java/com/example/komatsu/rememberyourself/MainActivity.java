package com.example.komatsu.rememberyourself;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.tooleap.sdk.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, MyTooleapActivity.class);
            TooleapPopOutMiniApp app = new TooleapPopOutMiniApp(this, intent);
            app.contentTitle = "New Frontier";
            app.contentText = "Hello! This is new Tooleap mini app!";
            app.bubbleBackgroundColor = 0x78FFFFFF;
            Tooleap.getInstance(this).addMiniApp(app);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

package org.xbmc.android.remote.presentation.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.xbmc.android.remote.R;





/**
 * Created by Amitojsandhu on 14-11-06.
 */
public class HomeScreenActivity extends Activity {

    Button go, menu, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);


        // Declare Buttons
        go = (Button) findViewById(R.id.button_go);
        menu = (Button) findViewById(R.id.button_menu);
        settings = (Button) findViewById(R.id.button_settings);

        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, AboutActivity.class));
            }
        });
    }
}

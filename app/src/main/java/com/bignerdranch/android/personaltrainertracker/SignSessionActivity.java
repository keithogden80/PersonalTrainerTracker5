package com.bignerdranch.android.personaltrainertracker;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SignSessionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_session);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public void dialog(){
        new AlertDialog.Builder(this)
                .setTitle("Log Out")
                .setMessage("Logging out...")

                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }

                }).create().show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.log_out){
            super.onOptionsItemSelected(item);

            dialog();

            Intent intent = new Intent(this, LoginActivity.class);
            //startActivity(intent);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

}

package com.maunt.myapplication.Communicate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.maunt.myapplication.Home.SharedPreference;
import com.maunt.myapplication.R;


public class Abouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.communicate_about);

        String Msg= SharedPreference.getMsg(this);

        if(Msg != null){
            TextView myKeyNote = (TextView) findViewById(R.id.myKeyNote);
            myKeyNote.setText(Msg);
        }



    }




    public void gmailclicked(View v){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","polosofts@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Suggestions");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

}

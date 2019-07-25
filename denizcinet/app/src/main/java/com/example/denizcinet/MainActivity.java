package com.example.denizcinet;



import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private  long backPressTime;
    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mProgressStatus < 100){
                    mProgressStatus++;
                    android.os.SystemClock.sleep(15);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(MainActivity.this, AnasayfaActivity.class));
                    }
                });
            }
        }).start();
    }
    public void onBackPressed(){

        if(backPressTime+2000> System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }
        else {
            Toast.makeText(getBaseContext(),"asd",Toast.LENGTH_LONG).show();

        }

        backPressTime=System.currentTimeMillis();


    }

}
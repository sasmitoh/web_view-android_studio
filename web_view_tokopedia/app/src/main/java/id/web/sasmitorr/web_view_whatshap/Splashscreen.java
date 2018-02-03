package id.web.sasmitorr.web_view_whatshap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splashscreen extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        handler=new Handler();
        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }

        }, 3000);

    };

}


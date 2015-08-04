package net.mnafian.logomovingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartAnimationsDowntoUp();
    }

    private void StartAnimationsDowntoUp()
    {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alphauptodown);
        anim.reset();
        RelativeLayout l=(RelativeLayout) findViewById(R.id.muktamar_id);
        l.clearAnimation();
        l.startAnimation(anim);
        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.mn_logo);
        iv.setImageResource(R.drawable.muktamar);
        iv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        iv.clearAnimation();
        iv.startAnimation(anim);

    }
}

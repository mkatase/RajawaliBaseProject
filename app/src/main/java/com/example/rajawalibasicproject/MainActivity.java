package com.example.rajawalibasicproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import org.rajawali3d.view.ISurface;
import org.rajawali3d.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    MainRenderer renderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SurfaceView surface = new SurfaceView(this);
        surface.setFrameRate(60.0);
        surface.setRenderMode(ISurface.RENDERMODE_WHEN_DIRTY);

        // Add mSurface to your root view
        addContentView(surface,
                new RelativeLayout.LayoutParams(WC, WC));
        //new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT));

        renderer = new MainRenderer(this);
        surface.setSurfaceRenderer(renderer);
    }
}

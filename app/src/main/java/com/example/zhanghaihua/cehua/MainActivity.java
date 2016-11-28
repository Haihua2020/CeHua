package com.example.zhanghaihua.cehua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private SlideHolder mSlideHolder;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
     requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        super.onCreate(savedInstanceState);
        //全屏展示
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        mSlideHolder = (SlideHolder) findViewById(R.id.slideHolder);

		/*
		 * toggleView can actually be any view you want.
		 * Here, for simplicity, we're using TextView, but you can
		 * easily replace it with button.
		 *
		 * Note, when menu opens our textView will become invisible, so
		 * it quite pointless to assign toggle-event to it. In real app
		 * consider using UP button instead. In our case toggle() can be
		 * replaced with open().
		 */


        iv = (ImageView) findViewById(R.id.imageView);

        iv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mSlideHolder.toggle();
            }
        });
    }
}

package com.example.chenshuwang.kotlintest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var isClick = 0
    val strList = listOf(
        resources.getString(R.string.hello_world),
        resources.getString(R.string.after_click)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* If on Java
            Button btn = (Button)findViewById(R.id.changeTextButton);
            TextView textView = (textView)findViewById(R.id.textView);
        */
        val btn = findViewById(R.id.changeTextButton) as Button
        val textView = findViewById(R.id.textView) as TextView

        /* If on Java
            if (btn == null) {
                ...
            }
            btn.setOnClickListener(new OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (isClick == 0) {
                        isClick = 1;
                    } else {
                        isClick = 0;
                    }
                    if (textView == null) {
                        ...
                    }
                    textView.setText(strList[isClick]);
                }
            });
        */

        btn?.setOnClickListener({
            view -> run {
                isClick = if (isClick == 0) 1 else 0
                textView?.text = strList[isClick]
            }
        })
    }
}

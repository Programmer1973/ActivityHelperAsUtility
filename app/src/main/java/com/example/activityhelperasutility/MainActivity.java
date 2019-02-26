package com.example.activityhelperasutility;

/**
 * Простая программа, в которой демонстрируется использование class-а ActivityHelper для
 * вывода сообщений в TextView, Log и Toast. Как вариант, эту утилиту можно использовать как
 * дополнительный инструментарий отладки.
 *
 * @created 27.02.2019
 * @author Andrey Dudin <programmer1973@mail.ru>
 * @version 0.1.0.2019.02.27
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ScrollView mScrollView;
    private TextView mTextView;
    private Button mButtonRun;
    private Button mButtonClear;

    private static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScrollView = findViewById(R.id.scroll_view);
        mTextView = findViewById(R.id.text_view);
        mButtonRun = findViewById(R.id.button_run);
        mButtonClear = findViewById(R.id.button_clear);

        mButtonRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityHelper.ShowMessage(MainActivity.this, mTextView, String.valueOf(counter++));
                mScrollView.scrollTo(0, mTextView.getBottom());
            }
        });

        mButtonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("");
                counter = 0;
            }
        });
    }
}
package io.weichao.flexboxlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlexboxLayout flexboxLayout = findViewById(R.id.flexbox_layout);

        TextView textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("计算机");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("回收站");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("美图秀秀");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("美图秀秀批处理");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("MarkdownPad 2");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("Steam");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("华为手机助手");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("雷神加速器");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("R X64 3.4.2");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("Google Chrome");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("简历");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("data");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("变系数部分非线性模型");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("eclipse");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("studio2");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("android_studio_workspace - 快捷方式");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("eclipse_workspace - 快捷方式");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("Internet Explorer");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("Photoshop");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("XMind");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("计算器");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("画图");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("命令提示符");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("Visual Studio 2015");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("visual_studio_workspace - 快捷方式");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("web_workspace - 快捷方式");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("git_workspace - 快捷方式");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("ATOM 图片分割");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("ScreenToGif");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("格式工厂");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("Samsung Kies");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("apktool");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("小汽车指标.txt");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("Axure RP");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("color.exe - 快捷方式");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("bsszjc_Android - 快捷方式");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("studio3");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("PLAYERUNKNOWN'S BATTLEGROUNDS");
        flexboxLayout.addView(textView);

        textView = (TextView) View.inflate(this, R.layout.textview, null);
        textView.setText("RStudio");
        flexboxLayout.addView(textView);
    }
}

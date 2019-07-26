package com.kareem.texttospeechandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class SymbolsActivity extends AppCompatActivity {

    private TextView symbols_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbols);
        getSupportActionBar().setTitle(getResources().getString(R.string.symbols_title_txt));

        symbols_tv = findViewById(R.id.symbols_TV);

        String htmlStringWithMathSymbols = "&#8722;   &#43;   &#177;   &#215;   &#247;   &#37; &#137; <br/>" +
                "  &#61;   &#8800;   &#8776;   &#8801; <br/>" +
                "   &#60;   &#62;   &#8804;   &#8805;   &#8734; <br/> " +
                " &#8539;   &#188;  &#8540;   &#189;   &#8541;   &#190;   &#8542; <br/> " +
                " &#8747; 1 dx = x  <br/>" +
                " <sup>&#8706;x</sup>&#8260;<sub>dx</sub>  <br/>" +
                "  &#8710;x     &#8710;y  <br/>  " +
                " &#8719;    &#8721;  &#8735;   <br/> " +
                "&#8730;4 = 2  <br/> " +
                "(X &#8745; Y)  <br/> " +
                "&#131;(g &#8729; m)" ;

        symbols_tv.setText(Html.fromHtml(htmlStringWithMathSymbols)+
                "\n\n\n"+
                " نها (س + ص + 1)  \n" +
                "س -> "+Html.fromHtml("&#8734;")+"            \n\n"+
                "د(س) = س + 1 \n\n"
                );

    }
}

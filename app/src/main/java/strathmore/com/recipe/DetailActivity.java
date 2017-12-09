package strathmore.com.recipe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by alice nimu on 15/11/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private WebView mWebView;
              @Override
             protected void onCreate(Bundle savedInstanceState) {
                  super.onCreate(savedInstanceState);
                  setContentView(R.layout.activity_recipe_detail);

                  //1
                  String title = this.getIntent().getExtras().getString("title");
                  String url = this.getIntent().getExtras().getString("url");

                  //2

                  setTitle(title);

                  //3 private WebView mWebView;


      mWebView = (WebView) findViewById(R.id.detail_web_view);

        //4
        mWebView.loadUrl(url);
    }



}

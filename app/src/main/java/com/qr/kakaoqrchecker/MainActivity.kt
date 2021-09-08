package com.qr.kakaoqrchecker

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.browser.customtabs.CustomTabsIntent
import com.qr.kakaoqrchecker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var baseUrl: String
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        baseUrl = "kakaotalk://qrcheckin?callingPkg=TalkWidgetExtension"

        val builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(baseUrl))
        finish()
    }
}
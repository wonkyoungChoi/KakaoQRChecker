package com.qr.kakaoqrchecker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.browser.customtabs.CustomTabsIntent

class MainActivity : AppCompatActivity() {

    private lateinit var baseUrl: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val url = "kakaotalk://qrcheckin?callingPkg=TalkWidgetExtension"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            finish()
        } catch (e : Exception) {
            Toast.makeText(applicationContext, "카카오톡 앱을 설치하셔야 QR인증이 가능합니다.", Toast.LENGTH_SHORT).show()
            val url = "https://play.google.com/store/apps/details?id=com.kakao.talk"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            finish()
        }

    }
}
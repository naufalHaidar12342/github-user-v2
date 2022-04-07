package xyz.heydarrn.dynamicgithubuserv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import xyz.heydarrn.dynamicgithubuserv2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindMainActivity:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindMainActivity= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindMainActivity.root)
    }
}
package kr.co.tjoeun.lifecycle_20200712

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        Handler를 변수로 만들고, 이 Handler로 2.5초 후에 메인으로 이동.
        val myHandler = Handler()

        myHandler.postDelayed({

//            일정 시간이 지난 후에 실행할 내용
    //        메인화면으로 이동하기
            val myIntent = Intent(mContext, MainActivity::class.java)
            startActivity(myIntent)

        }, 2500)
    }

}
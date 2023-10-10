package kr.hs.emirim.kye.vote_10_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        title = "투표 결과"

        var intent = intent
        var voteCoutn = intent.getIntArrayExtra("voteCount");
        var imgName = intent.getStringArrayExtra("imgName")

    }
}
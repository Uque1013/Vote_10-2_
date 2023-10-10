package kr.hs.emirim.kye.vote_10_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "뮤지컬 선호도 투표"

        var voteCount = IntArray(9)
        // int[] voteCount = new int[9];
        for(i in 0 .. 8)
            voteCount[i] = 0

        var imgV = arrayOfNulls<ImageView>(9)

        var imgVId = arrayOf(R.id.iv1, R.id.iv2, R.id.iv3,
                            R.id.iv4, R.id.iv5, R.id.iv6,
                            R.id.iv7, R.id.iv8, R.id.iv9)

        var imgName = arrayOf("데스노트", "드라큘라", "몬테크리스토",
                            "멤피스", "오페라의 유령", "레베카",
                            "웃는 남자", "프랑켄슈타인", "스위니토드")

        for(i in imgVId.indices) {
            imgV[i] = findViewById(imgVId[i])
            imgV[i]!!.setOnClickListener {
                voteCount[i]++
                Toast.makeText(applicationContext, imgName[i]+": "+voteCount[i]+"표", Toast.LENGTH_SHORT).show()
            }
        }
        var btnResult = findViewById<Button>(R.id.btnResult)
        btnResult.setOnClickListener {
            var intetnt = Intent(applicationContext, ResultActivity::class.java)
            intent.putExtra("voteCount", voteCount)
            intent.putExtra("imgName", imgName)
            startActivity(intent)
        }
    }
}
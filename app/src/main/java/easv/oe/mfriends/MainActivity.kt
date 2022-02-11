package easv.oe.mfriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLevel1(view: View) {
      val intent = Intent(this, ActivityFriendlist1::class.java)
        startActivity(intent)

    }
    fun onClickLevel2(view: View) {
        val intent = Intent(this, ActivityFriendlist2::class.java)
        startActivity(intent)
    }
    fun onClickLevel3(view: View) {
        val intent = Intent(this, ActivityFriendlist3::class.java)
        startActivity(intent)
    }
}
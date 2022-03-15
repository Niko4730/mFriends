package easv.oe.mfriends

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityAddEdit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addedit)//set layout to friendlist.xml
    }
     fun onClickCancel(view : View) {
        finish()
    }

}
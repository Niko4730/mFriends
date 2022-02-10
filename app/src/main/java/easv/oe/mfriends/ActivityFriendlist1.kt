package easv.oe.mfriends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Toast
import com.easv.oe.friends.Model.Friends
import kotlinx.android.synthetic.main.activity_friendlist.*

class ActivityFriendlist1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friendlist)

        val mFriendNames = Friends().getAllNames()

        val adapter : ListAdapter  = ArrayAdapter(this, android.R.layout.simple_list_item_1, mFriendNames)

        lvFriends.adapter = adapter

        lvFriends.setOnItemClickListener { _,_,pos, _ -> onListItemClick(pos) }
    }

    fun onListItemClick( position: Int ) {
        // position is in the list!
        // first get the name of the person clicked
        val name = Friends().getAll()[position].name
        // and a greeting
        Toast.makeText(
            this,
            "Hi $name! Have you done your homework?",
            Toast.LENGTH_LONG
        ).show()


    }
}
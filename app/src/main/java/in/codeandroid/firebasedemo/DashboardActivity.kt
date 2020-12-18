package `in`.codeandroid.firebasedemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuth.*
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    private lateinit var logout_btn: Button
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        auth = getInstance()
        logout_btn = findViewById(R.id.logout_btn)
        logout_btn.setOnClickListener{
            auth.signOut()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        }

    fun logout(view: View) {

    }
}





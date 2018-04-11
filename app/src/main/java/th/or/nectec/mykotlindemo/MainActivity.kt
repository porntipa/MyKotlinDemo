package th.or.nectec.mykotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var mUsernameEdit: EditText
    private lateinit var mPasswordEdit: EditText
    private lateinit var mLoginButton: Button
    private lateinit var mImageview: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindWidget();
    }

    private fun bindWidget() {
        mUsernameEdit = findViewById<EditText>(R.id.usernameEditText)
        mPasswordEdit = findViewById<EditText>(R.id.passwordEditText)
        mLoginButton = findViewById<Button>(R.id.loginButton)
        mImageview = findViewById<ImageView>(R.id.imageView)
    }

    fun onClickSubmit(v: View){
        val username = mUsernameEdit.text.toString()
        val password = mPasswordEdit.text.toString()

        Toast.makeText(applicationContext, "Hey", Toast.LENGTH_LONG).show()

        val url = "https://i.pinimg.com/originals/a6/f1/24/a6f1243576c7430a6eac6cbe3ca711c2.jpg"
        Glide.with(this).load(url).into(mImageview)
    }
}

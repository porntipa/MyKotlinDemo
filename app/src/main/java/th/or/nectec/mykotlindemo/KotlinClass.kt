package th.or.nectec.mykotlindemo

import android.content.Context
import android.widget.Toast

/**
 * Created by rezzipuy on 11/4/2018 AD.
 */
class KotlinClass {
    fun callKotlin(context: Context){
        Toast.makeText(context, "I'm Kotlin", Toast.LENGTH_LONG).show();
    }

    fun callJava(context: Context){
        val java = JavaClass()
        java.callJava(context)
    }
}
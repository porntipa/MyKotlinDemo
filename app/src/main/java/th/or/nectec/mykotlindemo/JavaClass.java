package th.or.nectec.mykotlindemo;

import android.content.Context;
import android.widget.Toast;


/**
 * Created by codemobiles on 8/10/17.
 */

public class JavaClass {
    public void callJava(Context context){
        Toast.makeText(context, "I'm Java", Toast.LENGTH_SHORT).show();
    }

    public void callKotlin(Context context){
        KotlinClass kotlin = new KotlinClass();
        kotlin.callKotlin(context);

    }
}

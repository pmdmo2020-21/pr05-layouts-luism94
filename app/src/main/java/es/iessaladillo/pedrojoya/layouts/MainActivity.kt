package es.iessaladillo.pedrojoya.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: USAR UNO DE LOS LAYOUTS DEFINIDOS PARA PROBARLO.
        //setContentView(R.layout.relative_layout_activity)
        //setContentView(R.layout.linearlayout_activity)
        setContentView(R.layout.constraint_layout_activity)
    }
}
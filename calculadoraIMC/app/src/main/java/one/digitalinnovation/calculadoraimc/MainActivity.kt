package one.digitalinnovation.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "CREATE - estou criando a tela")
        //Destroy a activity
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "START - deixei a tela visível")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "STOP - a tela não está mais visível, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "RESTART - a tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "DESTROY - oh não! a tela foi destruída")
    }
}
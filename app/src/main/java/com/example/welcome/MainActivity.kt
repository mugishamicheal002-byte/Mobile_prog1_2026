package com.example.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.welcome.ui.theme.NdejjeWelcomeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NdejjeWelcomeAppTheme {
                StudentInfo()


                }
            }
        }
    }

@Composable
fun StudentInfo(){
    Text(text="Wangadya Rusten")
    Text(text="Bachelor of Computer Science")
    Text(text="REG NO.:")
    Text(text="24/2/306/D/049")
}
@Preview(showBackground = true)
@Composable
fun WelcomePreview(){
    NdejjeWelcomeAppTheme {
        StudentInfo()
    }

}
package me.uditverma.sample.cafecoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import me.uditverma.sample.cafecoffee.ui.theme.CafeCoffeeTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            CafeCoffeeTheme {
//                CafeCoffeeApp(windowSizeClass = windowSizeClass)
            }
        }
    }
}

//@Composable
//fun CafeCoffeeApp(windowSizeClass: WindowSizeClass) {
//    when (windowSizeClass.widthSizeClass) {
//        WindowWidthSizeClass.Compact -> {
//            CompactUI()
//        }
//        else -> {
//            ExpandedUI()
//        }
//    }
//}
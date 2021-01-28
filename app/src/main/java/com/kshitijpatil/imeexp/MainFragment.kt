package com.kshitijpatil.imeexp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.input.TextFieldValue
import androidx.fragment.app.Fragment
import com.kshitijpatil.imeexp.ui.theme.ImeGlitchTheme
import dev.chrisbanes.accompanist.insets.*

class MainFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            id = R.id.mainFragment
            layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT)
            // Create an ViewWindowInsetObserver using this view
            val observer = ViewWindowInsetObserver(this)
            // Call start() to start listening now.
            // The WindowInsets instance is returned to us.
            val windowInsets = observer.start()
            setContent {
                ImeGlitchTheme {
                    Providers(AmbientWindowInsets provides windowInsets) {
                        MainContent()
                    }
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    var text by remember { mutableStateOf(TextFieldValue()) }
    Box(modifier = Modifier
        .navigationBarsPadding()
        .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
        ) {
            Text(
                "Click Here \u2193",
                style = MaterialTheme.typography.h5,
                color = Color.White,
                //modifier = Modifier.fillMaxWidth().wrapContentWidth()
            )
            OutlinedTextField(
                value = text,
                onValueChange = {
                    Log.i("MainContent","Value Changed")
                    text = it
                },
            )
        }
    }
}
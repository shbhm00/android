package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                    ) {
                    ComposeArticle(
                        title = stringResource(R.string.jetpack_compose_tutorial),
                        para1 = stringResource(R.string.compose_para_one),
                        para2 = stringResource(R.string.compose_para_two)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(title: String, para1: String, para2: String,modifier: Modifier=Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = para1,
            modifier=Modifier
                .padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify


        )
        Text(text = para2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(20.dp))
    }

}

@Composable
fun ComposeQuadrant()
{

}

@Composable
fun Box(color:String,title: String,)
{

}
//@Composable
//fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        modifier = modifier
//    ) {
//        Text(
//            text = message,
//            fontSize = 100.sp,
//            lineHeight = 116.sp,
//            textAlign = TextAlign.Center
//        )
//        Text(
//            text = from,
//            fontSize = 36.sp,
//            modifier = Modifier
//                .padding(16.dp)
//                .align(alignment = Alignment.CenterHorizontally)
//        )
//    }
//}

//@Composable
//fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
//    val image = painterResource(R.drawable.androidparty)
//    Box(modifier) {
//        Image(
//            painter = image,
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            alpha = 0.5F
//        )
//        GreetingText(
//            message = message,
//            from = from,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp)
//        )
//    }
//
//}

@Preview(showBackground = true)
@Composable
fun BirthDayPreview() {
    BirthdayCardTheme {
        ComposeArticle(
            title = stringResource(R.string.jetpack_compose_tutorial),
            para1 = stringResource(R.string.compose_para_one),
            para2 = stringResource(R.string.compose_para_two)
        )
    }
}

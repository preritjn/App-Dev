package com.jain.composebegin

import android.accounts.AuthenticatorDescription
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.lexend_thin, FontWeight.Thin),
            Font(R.font.lexend_light, FontWeight.Light),
            Font(R.font.lexend_regular, FontWeight.Normal),
            Font(R.font.lexend_medium, FontWeight.Medium),
            Font(R.font.lexend_semibold, FontWeight.SemiBold),
            Font(R.font.lexend_bold, FontWeight.Bold),
            Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
            Font(R.font.lexend_extralight, FontWeight.ExtraLight)
        )


        setContent {
//            Column(modifier = Modifier
////                .padding(150.dp)
////                .padding(175.dp,375.dp,175.dp,400.dp)
////                .width(250.dp)
////                .fillMaxHeight(0.7f)
////                .requiredWidth(600.dp)
////                .border(2.dp, Color.Yellow)
//                .background(Color.Gray),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//                Text(text = "Hello")
////                Text(text = "Hello", modifier = Modifier.offset(0.dp,30.dp))
////                Spacer(modifier = Modifier.height(50.dp))
//                Text(text = "World")
//                Text(text = "Good Eve")
//            }

//            Row(horizontalArrangement = Arrangement.Center,
//            verticalAlignment = Alignment.CenterVertically){
//                Text(text="Jetpack")
//                Text(text = "Compose")
//            }


//            ImageCard


//            val painter = painterResource(id = R.drawable.image)
//            val description = "THIS PICTURE"
//            val title = "THIS PICTURE"
//            ImageCard(painter =painter, title =title, contentDescription =description)
//

//        Text Styling


//            Box(modifier = Modifier
//                .background(Color(0xFF101010))
//                .fillMaxSize(),
//                contentAlignment = Alignment.Center) {
//                Text(
//                    text = buildAnnotatedString {
//                        withStyle(
//                            style= SpanStyle(
//                                color=Color.Green,
//                                fontSize = 50.sp,
//                                textDecoration = TextDecoration.None
//                            )
//                        ){
//                            append("J")
//                        }
//                        append("etpack ")
//                        withStyle(
//                            style= SpanStyle(
//                                color=Color.Green,
//                                fontSize = 50.sp,
//                                textDecoration = TextDecoration.None
//                            )
//                        ) {
//                            append("C")
//                        }
//                        append("ompose")
//
//                    },
//                    color = Color.White,
//                    fontSize = 30.sp,
//                    fontFamily = fontFamily,
//                    fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
////                    textAlign = TextAlign.Center
//                    textDecoration = TextDecoration.Underline
//                )
//            }


//            State


//            ColorBox(modifier = Modifier
//                .fillMaxSize())

//            Snackbar


//            val scaffoldState = rememberScaffoldState()
//            var textFieldState by remember {
//                mutableStateOf("")
//            }
//            val coroutine= rememberCoroutineScope()
//            Scaffold(modifier = Modifier.fillMaxSize(),
//                scaffoldState = scaffoldState ) {
//                Column(horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(30.dp)) {
//                        TextField(value = textFieldState,
//                            label = {
//                                Text(text = "Enter your name")
//                            },
//                            onValueChange = {
//                                textFieldState=it
//                            },
//                            singleLine = true,
//                            modifier = Modifier.fillMaxWidth())
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Button(onClick = {
//                        coroutine.launch {
//                            scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
//                        }
//                    }) {
//                        Text("Greet Me")
//                    }
//                }
//            }

//            List

//
//            LazyColumn{
//                items(500){
//                    Text(
//                        text = "item ${it+1}",
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .padding(12.dp)
//                            .fillMaxWidth())
//                }
//            }
        }
    }
}


//@Composable
//fun ImageCard(
//    painter: Painter,
//    title: String,
//    contentDescription: String,
//    modifier: Modifier =Modifier) {
//        Card(modifier = modifier
//            .fillMaxWidth(0.6f)
//            .padding(18.dp),
//            shape=RoundedCornerShape(15.dp),
//            elevation = 5.dp) {
//            Box(modifier = Modifier.height(200.dp)) {
//                Image(painter = painter,
//                    contentDescription = contentDescription,
//                    contentScale = ContentScale.FillBounds)
//                Box(modifier = Modifier
//                    .fillMaxSize()
//                    .background(Brush.verticalGradient(
//                        colors = listOf(
//                            Color.Transparent,
//                            Color.Black
//                        ),
//                        startY = 300f
//                    )))
//                Box(modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//                    contentAlignment = Alignment.BottomCenter){
//                    Text(
//                        title, style = TextStyle(
//                            color = Color.White, fontSize = 16.sp)
//                    )
//                }
//        }
//    }
//}

//@Composable
//fun ColorBox(modifier: Modifier){
//    val color= remember {
//        mutableStateOf(Color.Yellow)
//    }
//    Box(modifier = modifier
//        .background(color.value)
//        .clickable {
//            color.value = Color(
//                Random.nextFloat(),
//                Random.nextFloat(),
//                Random.nextFloat(),
//                1f
//            )
//        }
//    )
//}
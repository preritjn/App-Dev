package com.jain.composebegin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
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
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.modifier.modifierLocalConsumer
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
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
//                    textAlign = TextAlign.Center,
//                    textDecoration = TextDecoration.Underline
//                )
//            }

//            State
//            Column(Modifier
//                .fillMaxSize()) {
//                val color = remember {
//                    mutableStateOf(Color.Gray)
//                }
//                ColorBox(modifier = Modifier
//                    .weight(1f)
//                    .fillMaxSize()) {
//                    color.value = it
//                }
//                Box(modifier = Modifier
//                    .background(color.value)
//                    .weight(1f)
//                    .fillMaxSize())
//            }


//            ImageCard

//            val painter = painterResource(id = R.drawable.image)
//            val description = "THIS PICTURE"
//            val title = "THIS PICTURE"
//            ImageCard(painter =painter, title =title, contentDescription =description)

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

//            LazyColumn {
//                items(500) {
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

//            Constraints Layout

//            val constraints = ConstraintSet {
//                val greenBox = createRefFor("greenbox")
//                val redBox = createRefFor("redbox")
//
//                constrain(greenBox) {
//                    top.linkTo(parent.top)
//                    start.linkTo(parent.start)
//                    width = Dimension.value(100.dp)
//                    height = Dimension.value(100.dp)
//                }
//                constrain(redBox) {
//                    top.linkTo(parent.top)
//                    start.linkTo(greenBox.end)
//                    end.linkTo(parent.end)
//                    width = Dimension.value(100.dp)
//                    height = Dimension.value(100.dp)
//                }
//                createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
//            }
//            ConstraintLayout(constraints, modifier = Modifier
//                .fillMaxSize()) {
//                Box(modifier = Modifier
//                    .background(Color.Red)
//                    .layoutId("redbox"))
//                Box(modifier = Modifier
//                    .background(Color.Green)
//                    .layoutId("greenbox"))
//            }

//            var sizeState by remember  {
//                mutableStateOf(200.dp)
//            }
//            val size by animateDpAsState(
//                targetValue = sizeState,
//                tween(
//                    durationMillis = 1000
//                )
//            )
//            val infiniteAnimation = rememberInfiniteTransition()
//            val color by infiniteAnimation.animateColor(
//                initialValue = Color.Red,
//                targetValue = Color.Green,
//                animationSpec = infiniteRepeatable(
//                    tween(durationMillis = 2000),
//                    repeatMode = RepeatMode.Reverse
//                )
//            )
//            Box(modifier = Modifier
//                .background(color)
//                .size(size),
//                contentAlignment = Alignment.Center) {
//                Column(verticalArrangement = Arrangement.SpaceEvenly) {
//                    Button(onClick = {
//                        sizeState += 50.dp }) {
//                        Text(text = "Increase size")
//                    }
//                    Button(onClick = {
//                        sizeState -= 50.dp }) {
//                        Text(text = "Decrease size")
//                    }
//                }
//            }

            Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
                CircularProgressBar(percentage = 0.79f, number = 10248488
                )
            }
        }
    }
}


@Composable
fun ImageCard(
    painter: Painter,
    title: String,
    contentDescription: String,
    modifier: Modifier =Modifier) {
        Card(modifier = modifier
            .fillMaxWidth(0.6f)
            .padding(18.dp),
            shape=RoundedCornerShape(15.dp),
            elevation = 5.dp) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.FillBounds)
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    ))
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                    contentAlignment = Alignment.BottomCenter){
                    Text(
                        title,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 16.sp)
                    )
                }
        }
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier,
    updateColor: (Color)-> Unit) {

    Box(modifier = modifier
        .background(Color.Yellow)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    )
}

@Composable
fun CircularProgressBar(
    percentage : Float,
    number : Int,
    fontSize: TextUnit = 28.sp,
    radius: Dp = 70.dp,
    color : Color = Color.Green,
    strokeWidth: Dp = 8.dp,
    animDuration: Int = 1000,
    animDelay: Int = 0
) {
    var animationPlayed by remember {
        mutableStateOf(false)
    }
    val currPercentage = animateFloatAsState(
        targetValue = if(animationPlayed)
                          percentage
                      else
                          0f,
        tween(
            durationMillis = animDuration,
            delayMillis = animDelay
        )
    )
    LaunchedEffect(key1 = true) {
        animationPlayed = true
    }
    Box(modifier = Modifier
        .size(radius * 2f),
        contentAlignment = Alignment.Center) {
        Canvas(modifier = Modifier
            .size(radius * 2f)) {
            drawArc(
                color = color,
                -90f,
                360 * currPercentage.value,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )
        }
        Text(
            text = (currPercentage.value * number).toInt().toString(),
            color = Color.Black,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}
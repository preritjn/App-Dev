package com.jain.composebegin

import android.os.Bundle
import android.view.MotionEvent
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
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
import kotlin.math.PI
import kotlin.math.atan2
import kotlin.math.roundToInt
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

//            Circular Progress Bar

//            Box(modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center) {
//                CircularProgressBar(percentage = 0.79f, number = 10248488
//                )
//            }

//            Music Knob

//            Box(contentAlignment = Alignment.Center,
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color(0xFF101010))
//            ) {
//                Row(horizontalArrangement = Arrangement.Center,
//                    verticalAlignment = Alignment.CenterVertically,
//                    modifier = Modifier
//                        .border(1.dp, Color.Green, RoundedCornerShape(10.dp))
//                        .padding(30.dp)
//                ) {
//                    var volume by remember {
//                        mutableStateOf(0f)
//                    }
//                    val barCount = 60
//                    MusicKnob(modifier = Modifier.size(80.dp)) {
//                        volume = it
//                    }
//                    Spacer(modifier = Modifier.width(20.dp))
//                    VolumeBar(modifier = Modifier
//                        .fillMaxWidth()
//                        .height(35.dp),
//                        activeBars = (volume * barCount).roundToInt(),
//                        barCount = barCount
//                    )
//                }
//            }

//          3D Animated transition
            Surface(
                color = Color(0xFF101010),
                modifier = Modifier.fillMaxSize()
            ) {
                DropDown(
                    text = "Hello World",
                    modifier = Modifier.padding(15.dp)
                ) {
                    Box(contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(Color.Green)
                    ) {
                        Text(
                            text = "Maa Chuda Madarchod",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.h4
                        )
                    }
                }
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

@Composable
fun VolumeBar(
    modifier: Modifier = Modifier,
    activeBars: Int = 0,
    barCount: Int = 10
) {
    BoxWithConstraints(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        val barWidth = remember {
             constraints.maxWidth / (2f * barCount)
        }
        Canvas(modifier = modifier) {
            for(i in 0 until barCount) {
                drawRoundRect(
                    color = if(i in 0..activeBars)
                                Color.Green
                            else
                                Color.DarkGray,
                    topLeft = Offset(i * barWidth * 2f + barWidth/2f,0f),
                    size = Size(barWidth,constraints.maxHeight.toFloat()),
                    cornerRadius = CornerRadius(0f)
                )
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun MusicKnob(
    modifier: Modifier = Modifier,
    limitingAngle: Float = 5f,
    onValueChanged: (Float) -> Unit
) {
    var rotation by remember {
        mutableStateOf(limitingAngle)
    }
    var touchX by remember {
        mutableStateOf(0f)
    }
    var touchY by remember {
        mutableStateOf(0f)
    }
    var centerX by remember {
        mutableStateOf(0f)
    }
    var centerY by remember {
        mutableStateOf(0f)
    }

    Image(painter = painterResource(id = R.drawable.music_knob),
        contentDescription ="Music Knob",
        modifier = modifier
            .fillMaxSize()
            .onGloballyPositioned {
                val windowBounds = it.boundsInWindow()
                centerX = windowBounds.size.width / 2f
                centerY = windowBounds.size.height / 2f
            }
            .pointerInteropFilter { event ->
                touchX = event.x
                touchY = event.y
                val angle = -atan2(centerX - touchX, centerY - touchY) * (180 / PI).toFloat()
                when (event.action) {
                    MotionEvent.ACTION_DOWN,
                    MotionEvent.ACTION_MOVE -> {
                        if (angle !in -limitingAngle..limitingAngle) {
                            val fixedAngle = if (angle in -180f..-limitingAngle) {
                                360f + angle
                            } else {
                                angle
                            }
                            rotation = fixedAngle
                            val percent = (fixedAngle - limitingAngle) / (360f - 2 * limitingAngle)
                            onValueChanged(percent)
                            true
                        } else
                            false
                    }
                    else -> false
                }
            }
            .rotate(rotation)
    )
}

@Composable
fun DropDown(
    text: String,
    modifier: Modifier = Modifier,
    initiallyOpened: Boolean = false,
    content: @Composable () -> Unit
) {
    var isOpen by remember {
        mutableStateOf(initiallyOpened)
    }

    var alpha = animateFloatAsState(
        targetValue = if(isOpen) 1f else 0f,
        animationSpec = tween(
            durationMillis = 300
        )
    )

    var rotateX = animateFloatAsState(
        targetValue = if(isOpen) 0f else -90f,
        animationSpec = tween(
            durationMillis = 300
        )
    )
    Column(
        modifier = modifier
        .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = text, 
                color = Color.White, 
                fontSize = 16.sp
            )
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Dropdown Icon",
                tint = Color.White,
                modifier = Modifier
                    .clickable {
                        isOpen = !isOpen
                    }
                    .scale(1f, if (isOpen) -1f else 1f)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .graphicsLayer {
                    transformOrigin = TransformOrigin(0.5f, 0f)
                    rotationX = rotateX.value
                }
                .alpha(alpha.value)
        ) {
            content()
        }
        
    }
}
package com.example.meditationui.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.meditationui.R

@Composable
fun HomeScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(DeepBlue)) {
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            GreetingSection(name = "Prerit")
            ChipSection(chips = listOf("Madarchod","Randi","Dari","Betichod","Chuttadchod","Bala","Maghiya"))
            CurrentMeditation()
        }
    }
}

@Composable
fun GreetingSection(name: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Good Morning, $name",
                style = MaterialTheme.typography.h4,
                color = Color.White)
            Text(text = "We wish you to have a good day!!",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }
        Icon(painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun ChipSection(
    chips: List<String>
) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(15.dp))
                    .background(
                        if (selectedChipIndex == it)
                            ButtonBlue
                        else
                            DarkerButtonBlue
                    )
            ) {
                Text(text = chips[it],
                    color = TextWhite,
                    modifier = Modifier.padding(15.dp))
            }
        }
    }
}

@Composable
fun CurrentMeditation(
    color: Color = LightRed
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(text = "Daily Thoughts",
                style = MaterialTheme.typography.h4,
                color = TextWhite
            )
            Text(
                text = "Meditation * 3-10 min",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_play),
                contentDescription ="Play",
                tint = Color.White,
                modifier = Modifier.size(17.dp))
        }
    }
}
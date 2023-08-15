package com.tanishq.joinjumbo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanishq.joinjumbo.R
import com.tanishq.joinjumbo.ui.theme.DarkestGreen
import com.tanishq.joinjumbo.ui.theme.LightGreen
import com.tanishq.joinjumbo.ui.theme.YoutubeColor

@Composable
fun JackpotScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            item {
                Box {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Jumbo Jackpot",
                            modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                            style = TextStyle(
                                fontSize = 26.sp,
                                fontWeight = FontWeight(700),
                                color = DarkestGreen
                            )
                        )
                        Button(
                            modifier = Modifier
                                .padding(end = 10.dp, top = 10.dp)
                                .wrapContentHeight(), // Adjust the height as needed
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA0E1E1))
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painterResource(id = R.drawable.ticket),
                                    contentDescription = "Cart button icon",
                                    modifier = Modifier.size(20.dp)
                                )
                                Text(
                                    text = "20",
                                    modifier = Modifier.padding(start = 5.dp),
                                    style = TextStyle(fontSize = 16.sp, color = DarkestGreen),
                                )
                            }
                        }
                    }

                }
                PrizesCard()
                YoutubeCard()
                PrizesAllotCard()
            }
        }


    }
}

@Composable
fun PrizesCard() {
    ElevatedCard(
        modifier = Modifier.padding(10.dp), elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),){
        Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()) {
            Text(
                text = "₹1cr tak ke prizes",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                )
            )

            Image(
                painterResource(id = R.drawable.banner),
                modifier  = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 10.dp),
                contentScale = ContentScale.FillBounds,
                contentDescription = "Banner",
            )


        }
    }
}


@Composable
fun YoutubeCard() {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = YoutubeColor),
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Box(modifier = Modifier.fillMaxWidth()){
                Text(
                    text = "Watch Jumbo Jackpot Show",
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight(700),
                    )

                )
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically // Align contents vertically in the center
            ) {
                Text(
                    text = "Live every Sunday 5pm \nPrize draw and winner announcement",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.White
                    ),
                    modifier = Modifier.weight(1f) // Take available space within the Row
                )

                Image(
                    painterResource(id = R.drawable.yt),
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 10.dp), // Add padding to the image
                    contentScale = ContentScale.Fit,
                    contentDescription = "Youtube",
                )
            }
        }
    }
}

@Composable
fun PrizesAllotCard() {
    ElevatedCard(
        modifier = Modifier.padding(10.dp), elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Last week’s winners",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                )
            )
            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically // Align contents vertically in the center
            ) {
                Text(
                    text = "#1",
                    style = TextStyle(
                        fontSize = 16.sp,
                    )
                )

                Image(
                    painter = painterResource(id = R.drawable.banner),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 10.dp)
                        .size(50.dp)
                        .clip(CircleShape)

                )

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 14.dp, top = 10.dp)) {
                    Text(
                        text = "Neeraj (Delhi)",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight(600)
                        )
                    )
                    Text(
                        text = "Won iPhone 13 Pro Max ",
                        style = TextStyle(
                            fontSize = 16.sp,
                        )
                    )
                }
            }

            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically // Align contents vertically in the center
            ) {
                Text(
                    text = "#1",
                    style = TextStyle(
                        fontSize = 16.sp,
                    )
                )

                Image(
                    painter = painterResource(id = R.drawable.banner),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 10.dp)
                        .size(50.dp)
                        .clip(CircleShape)

                )

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 14.dp, top = 10.dp)) {
                    Text(
                        text = "Neeraj (Delhi)",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight(600)
                        )
                    )
                    Text(
                        text = "Won iPhone 13 Pro Max ",
                        style = TextStyle(
                            fontSize = 16.sp,
                        )
                    )
                }
            }

            Row(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically // Align contents vertically in the center
            ) {
                Text(
                    text = "#1",
                    style = TextStyle(
                        fontSize = 16.sp,
                    )
                )

                Image(
                    painter = painterResource(id = R.drawable.banner),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 15.dp, top = 10.dp)
                        .size(50.dp)
                        .clip(CircleShape)

                )

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 14.dp, top = 10.dp)) {
                    Text(
                        text = "Neeraj (Delhi)",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight(600)
                        )
                    )
                    Text(
                        text = "Won iPhone 13 Pro Max ",
                        style = TextStyle(
                            fontSize = 16.sp,
                        )
                    )
                }
            }


        }
    }

}



@Preview(device = Devices.NEXUS_5, showBackground = true)
@Composable
fun JackpotScreenPreview() {
    JackpotScreen()
}
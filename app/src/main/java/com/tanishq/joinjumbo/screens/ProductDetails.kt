package com.tanishq.joinjumbo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanishq.joinjumbo.R
import com.tanishq.joinjumbo.ui.theme.DarkestGreen
import com.tanishq.joinjumbo.ui.theme.FacebookColor
import com.tanishq.joinjumbo.ui.theme.OffWhite

@Composable
fun ProductDetailsScreen() {

    Surface(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            item {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    CardProduct()
                    ProductDescription()

                }
            }
        }
    }

}


@Composable
fun CardProduct() {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = DarkestGreen),
        modifier = Modifier
            .padding(10.dp)
            .padding(top = 10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {

            Row {

                Box {
                    ElevatedCard(
                        modifier = Modifier
                            .width(125.dp)
                            .height(125.dp),
                        shape = RoundedCornerShape(15.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painterResource(id = R.drawable.headphone),
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(15.dp),
                                contentScale = ContentScale.Fit,
                                contentDescription = "profile",
                            )
                        }

                    }

                }

                Column {
                    Text(
                        text = "LG 4K LED TV (55’) - Magic Black", style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight(400),
                            color = Color.White
                        ), modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )
                    Text(
                        text = "⭐️ 4.5",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start,
                        color = Color.White,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )

                    Row(modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
                        Text(
                            text = "MRP:",
                            style = TextStyle(color = Color.White, fontSize = 12.sp, fontWeight = FontWeight(700)),

                        )
                        Text(
                            text = "₹30,000",
                            style = TextStyle(textDecoration = TextDecoration.LineThrough, color = Color.Red, fontSize = 12.sp, fontWeight = FontWeight(700)),
                        )

                    }

                    Row(modifier = Modifier.padding(start = 10.dp, top = 5.dp)) {
                        Text(
                            text = "Jumbo Price:",
                            style = TextStyle(color = Color.White, fontSize = 12.sp, fontWeight = FontWeight(700)),

                            )
                        Text(
                            text = "₹20,000",
                            style = TextStyle(color = Color.White, fontSize = 12.sp, fontWeight = FontWeight(700)),
                        )

                    }


                }

            }


        }
    }
}


@Composable
fun BulletedList(items: List<String>) {
    Column {
        items.forEach { item ->
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("• ") // Bullet character
                    }
                    append(item)
                },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}




@Composable
fun ProductDescription(){


    val items = listOf(
        "Resolution : Crystal 4K UHD (3840x2160) resolution | Refresh Rate : 60 Hertz",
        "Connectivity: 3 HDMI ports to connect set top box, Blu-ray speakers or a gaming console | 1 USB ports to connect hard drives or other USB devices",
        "Display: Ultra HD (4k) LED Panel | One Billion Colors | Air Slim Design | Supports HDR 10+ | PurColor | Mega Contarst | UHD Dimming | Auto Game Mode",
        "Sound: 20 Watts Output | Powerful Speakers with Dolby Digital Plus | Q Symphony",
        "Smart TV Features : Prime Video, Hotstar, Netflix, Zee5 and more | Tap View | PC Mode | Universal Guide | Web Browser | Screen Mirroring"
    )

    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = OffWhite),
        modifier = Modifier
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            BulletedList(items = items)



        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_5)
@Composable
fun DefaultPreviewOfProductDetailsScreen() {
    ProductDetailsScreen()
}

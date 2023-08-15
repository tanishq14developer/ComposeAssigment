package com.tanishq.joinjumbo.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanishq.joinjumbo.R
import com.tanishq.joinjumbo.ui.theme.DarkestGreen
import com.tanishq.joinjumbo.ui.theme.FacebookColor
import com.tanishq.joinjumbo.ui.theme.LightGreen
import com.tanishq.joinjumbo.ui.theme.OffWhite
import com.tanishq.joinjumbo.ui.theme.YoutubeColor

@Composable()
fun RewardsScreen() {

    Surface(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            item {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Rewards",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontWeight = FontWeight(700),
                        ),
                        modifier = Modifier
                            .align(Alignment.Start)
                            .padding(start = 15.dp)
                    )
                    BlueCard()

                    FeaturedCard()
                }
            }
        }
    }


}


@Composable
fun BlueCard() {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = FacebookColor),
        modifier = Modifier
            .padding(10.dp)
            .padding(top = 10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Coins",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                )
            )
            Text(
                text = "1530",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                ),
                modifier = Modifier.padding(top = 10.dp)

            )

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = DarkestGreen),
                onClick = { /*TODO*/ },
                contentPadding = PaddingValues(0.dp) // Remove default padding
            ) {
                Text(
                    text = "Reward History",
                    modifier = Modifier.padding(horizontal = 30.dp, vertical = 6.dp),
                    style = TextStyle.Default.merge(
                        TextStyle(
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )
                )
            }


        }
    }
}


@Composable
fun FeaturedCard() {
    ElevatedCard(
        modifier = Modifier.padding(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Featured Deals",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold, // Use FontWeight.Bold instead of FontWeight(700)
                )
            )

            Text(
                text = "Spend coins to claim rewards, offers from top brands, and other perks",
                style = TextStyle(
                    fontSize = 14.sp,
                ),
            )
            Box(modifier = Modifier.padding(top = 10.dp)) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(0.dp),
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(500.dp)
                ) {
                    items(10) {
                        CardGift()
                    }


                }
            }
        }

    }
}



@Composable
fun CardGift() {
    Box(modifier = Modifier.padding(top = 10.dp)) {
        ElevatedCard(
            modifier = Modifier
                .width(175.dp)
                .height(200.dp)
                .border(1.dp, Color.Black, RoundedCornerShape(10.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.White),
        ) {
            Column {
                Image(
                    painterResource(id = R.drawable.lock),
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 10.dp),
                    contentScale = ContentScale.FillWidth,
                    contentDescription = "lock",
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 5.dp)
                        .padding(top = 25.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painterResource(id = R.drawable.zm),
                        contentScale = ContentScale.FillWidth,
                        contentDescription = "zomato",
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center) // Center the image vertically
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Box(
                    modifier = Modifier
                        .background(OffWhite)
                        .fillMaxWidth()
                        .height(50.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Earn 411 Coins \n more to redeem",
                        style = TextStyle(
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier
                            .align(Alignment.Center)
                    )
                }
            }
        }
    }
}





@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun RewardsScreenPreview() {
    RewardsScreen()
}


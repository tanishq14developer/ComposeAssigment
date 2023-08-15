package com.tanishq.joinjumbo.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tanishq.joinjumbo.R
import com.tanishq.joinjumbo.ui.theme.OffWhite

@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            item {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "Jumbo", style = TextStyle(
                                fontSize = 22.sp,
                                fontWeight = FontWeight(700),
                            ), modifier = Modifier.padding(start = 15.dp)
                        )


                        Image(
                            painterResource(id = R.drawable.profile),
                            modifier = Modifier
                                .size(50.dp)
                                .padding(end = 10.dp), // Use end padding to align the image to the end
                            contentScale = ContentScale.FillWidth,
                            contentDescription = "profile",
                        )
                    }

                    Box(modifier = Modifier.padding(10.dp)) {
                        // Adjust the height of the LazyVerticalGrid
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(2),
                            contentPadding = PaddingValues(0.dp),
                            horizontalArrangement = Arrangement.spacedBy(20.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(max = 1000.dp)


                        ) {
                            items(20) {
                                ItemCard()
                            }
                        }
                    }









                    }
            }
        }
    }

}

@Composable
fun ItemCard(){
    ElevatedCard(
        modifier = Modifier
            .width(175.dp)
            .height(185.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = OffWhite),
    ) {
        Column {
            Box(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp)
            ) {
                ElevatedCard(
                    modifier = Modifier
                        .width(150.dp)
                        .height(125.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column( horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
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
            Text(
                text = "Boat Headphones", style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(300),
                ), modifier = Modifier.padding(start = 15.dp,top = 5.dp)
            )

            Row {
                Text(
                    text = "₹2,000",
                    style = TextStyle(textDecoration = TextDecoration.LineThrough, color = Color.Red, fontSize = 12.sp, fontWeight = FontWeight(300)),
                    modifier = Modifier.padding(start = 15.dp)
                )
                Text(
                    text = "₹1,500",
                    style = TextStyle(color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight(300)),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.NEXUS_5)
@Composable
fun DefaultPreviewOfHomeScreen() {
    HomeScreen()
}
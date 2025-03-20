package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun BMIResultScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF7D3AB7),
                        Color(0xFF9C27B0),
                    )
                )
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(
                    R.string.result
                ),
                fontSize = 40.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 50.dp)
                    .padding(start = 20.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(
                    topStart = 40.dp,
                    topEnd = 40.dp
                ),

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Transparent)
                        .padding(top = 20.dp)
                        .padding(end = 10.dp)
                        .padding(start = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .size(150.dp),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 7.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(color = 0xff7d3ab7),
                                    Color(color = 0xFF9C27B0)
                                )
                            )
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Text(
                                text = "30,6",
                                fontSize = 40.sp,
                                color = Color(0xff7d3ab7),
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(300.dp)
                            .padding(top = 10.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFCABEE5)
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.age
                                    ),
                                    fontSize = 25.sp
                                )
                                Text(
                                    text = "50",
                                    fontSize = 25.sp,
                                    color = Color(0xff000000),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            VerticalDivider(
                                modifier = Modifier
                                    .padding(vertical = 10.dp),
                                color = Color.Gray
                            )
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.weight
                                    ),
                                    fontSize = 25.sp
                                )
                                Text(
                                    text = "97 Kg",
                                    fontSize = 25.sp,
                                    color = Color(0xff000000),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                            VerticalDivider(
                                modifier = Modifier
                                    .padding(vertical = 10.dp),
                                color = Color.Gray
                            )
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ){
                                Text(
                                    text = stringResource(
                                        R.string.age
                                    ),
                                    fontSize = 25.sp
                                )
                                Text(
                                    text = "178 cm",
                                    fontSize = 25.sp,
                                    color = Color(0xff000000),
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .fillMaxWidth()
                            .height(270.dp)
                            .background(Color.Gray)
                    ) {  }
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .padding(horizontal = 10.dp),
                        color = Color.Gray
                    )
                    Button(
                        onClick ={},
                        modifier = Modifier
                            .width(300.dp)
                            .padding(top = 20.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xff7d3ab7)
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = stringResource(
                                R.string.new_calc
                            ),
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
    }
}



@Preview(showSystemUi = true)
@Composable
private fun BMIResultScreenPreview(){
    BMIResultScreen()
}



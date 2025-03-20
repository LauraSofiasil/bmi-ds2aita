package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AllInclusive
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Cake
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Label
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RenderEffect
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen (modifier: Modifier = Modifier) {

    var ageState = remember{
        mutableStateOf(value = "Age")
    }
    var weightState = remember {
        mutableStateOf(value = "Weight")
    }

    var heightState = remember {
        mutableStateOf(value = "Height")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF7D3AB7),
                            Color(0xFF9C27B0),
                        )
                    )
                ),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(
                    br.senai.sp.jandira.bmi.R.string.hi
                ),
                fontSize = 40.sp,
                modifier = Modifier
                    .padding(top = 50.dp)
                    .padding(start = 20.dp),
                color = Color.White
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(
                    topEnd = 40.dp,
                    topStart = 40.dp
                )
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row(
                        modifier = Modifier
                            .padding(bottom = 50.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(
                                    R.drawable.homem
                                ),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .padding(start = 5.dp)

                            )
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .width(100.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFF7D3AB7)
                                )
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.male
                                    )
                                )
                            }
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(
                                    R.drawable.mulher
                                ),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .padding(start = 5.dp)
                            )
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .width(100.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFF7D3AB7)
                                )
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.female
                                    )
                                )
                            }
                        }

                    }
                    OutlinedTextField(
                        value = ageState.value,
                        onValueChange = {
                            ageState.value = it
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Cake,
                                contentDescription = "",
                                tint = Color(0xFF7D3AB7)
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                        ),
                        modifier = Modifier
                            .padding(bottom = 25.dp)
                            .width(300.dp),
                        shape = RoundedCornerShape(12.dp),
                    )
                    OutlinedTextField(
                        value = weightState.value,
                        onValueChange = {
                            weightState.value = it
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Balance,
                                contentDescription = "",
                                tint = Color(0xFF7D3AB7)
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                        ),
                        modifier = Modifier
                            .width(300.dp)
                            .padding(bottom = 25.dp),
                        shape = RoundedCornerShape(12.dp)
                    )
                    OutlinedTextField(
                        value = heightState.value,
                        onValueChange = {
                            heightState.value = it
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Height,
                                contentDescription = "",
                                tint = Color(0xFF7D3AB7)
                            )
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                        ),
                        modifier = Modifier
                            .width(300.dp)
                            .padding(bottom = 80.dp),
                        shape = RoundedCornerShape(12.dp)
                    )
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(300.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF7D3AB7)
                        )
                    ) {
                        Text(
                            text = stringResource(
                                R.string.calculate
                            ),
                            fontSize = 27.sp
                        )
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun UserDataScreenPreview(){
    UserDataScreen()
}
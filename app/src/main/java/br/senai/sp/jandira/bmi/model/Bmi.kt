package br.senai.sp.jandira.bmi.model

import androidx.compose.ui.graphics.Color

data class Bmi (
    var color: Color = Color.Transparent,
    var status: BMIStatus = BMIStatus.NORMAL,
    var bmi: Pair <String, Double>
)

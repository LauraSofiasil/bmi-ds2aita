package br.senai.sp.jandira.bmi.calcs

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import br.senai.sp.jandira.bmi.R
import br.senai.sp.jandira.bmi.model.BMIStatus
import br.senai.sp.jandira.bmi.model.Bmi
import kotlin.math.pow

@Composable
fun bmiCalculate(weight: Int, height: Double): Bmi {
    //var bmi = weight / (height * height) -> Peso dividido pela altura ao quadrado
    //var bmi = weight.div(height.pow(2)) -> Divida o peso pela altura elevado ao quadrado

    var bmi = weight / height.pow(2) //Pow() -> elevado ao quadrado

    when{  //Parecido com um if
        bmi < 18.5 ->    //se bmi for menor que 18.5 faça....
            return Bmi(
                color = colorResource(R.color.light_blue),
                status = BMIStatus.UNDER_WEIGHT,
                bmi = Pair(stringResource(R.string.under_weight), bmi)
            )
        bmi >= 18.5 && bmi < 25.0 ->
            return Bmi(
                color = colorResource(R.color.light_green),
                status = BMIStatus.NORMAL,
                bmi = Pair(stringResource(R.string.normal_weight), bmi)
            )
        bmi >= 25.0 && bmi < 30.0 ->
            return Bmi(
                color = colorResource(R.color.yellow),
                status = BMIStatus.OVER_WEIGHT,
                bmi = Pair(stringResource(R.string.over_weight), bmi)
            )
        bmi >= 30.0 && bmi < 35.0 ->
            return Bmi(
                color = colorResource(R.color.light_orange),
                status = BMIStatus.OBESITY_1,
                bmi = Pair(stringResource(R.string.class1_weight), bmi)
            )
        bmi >= 35.0 && bmi < 40.0 ->
            return Bmi(
                color = colorResource(R.color.dark_orange),
                status = BMIStatus.OBESITY_2,
                bmi = Pair(stringResource(R.string.class2_weight), bmi)
            )
        else ->
            return Bmi(
                color = colorResource(R.color.light_red),
                status = BMIStatus.OBESITY_3,
                bmi = Pair(stringResource(R.string.class3_weight), bmi)
            )
    }
}
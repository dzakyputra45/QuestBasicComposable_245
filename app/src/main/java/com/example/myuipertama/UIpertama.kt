package com.example.myuipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R


@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.Prodi),
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold)
        Text(stringResource(R.string.Univ),
            fontSize = 22.sp)

        Spacer(modifier = modifier.height(height = 25.dp))
        Card (modifier = modifier
            .fillMaxWidth(fraction = 1f)
            .padding(all = 13.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )) {
            Row() {
                val gambar = painterResource(id = R.drawable.umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(size = 110.dp).padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(width = 30.dp))
                Column() {
                    Text(stringResource(R.string.Nama),
                        fontSize = 40.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 15.dp)
                    )

                    Text(stringResource(R.string.Alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.Copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}
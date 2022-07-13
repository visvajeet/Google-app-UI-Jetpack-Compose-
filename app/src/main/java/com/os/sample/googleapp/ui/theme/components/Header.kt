package com.os.sample.googleapp.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.*
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.os.sample.googleapp.R
import com.os.sample.googleapp.ui.theme.customShapes
import com.os.sample.googleapp.utils.sdp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 15.sdp)
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            AssistChip(
                onClick = {},
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Place, contentDescription = stringResource(
                            R.string.cd_weather
                        )
                    )
                },
                shape = customShapes.extraSmall,
                label = { Text(text = "23 C", style = MaterialTheme.typography.bodyMedium) })

            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = stringResource(
                    R.string.cd_profile_image
                ),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(30.sdp)
                    .clip(CircleShape)

            )
        }

        Spacer(modifier = Modifier.height(15.sdp))
        Image(
            painter = painterResource(R.drawable.google_logo),
            contentDescription = stringResource(
                R.string.cd_google
            ),
            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .alpha(0.5f)
        )
    }
}

@Preview
@Composable
fun HeaderPrev() {
    Header()
}
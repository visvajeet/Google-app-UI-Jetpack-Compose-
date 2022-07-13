package com.os.sample.googleapp.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.os.sample.googleapp.R
import com.os.sample.googleapp.ui.theme.customShapes
import com.os.sample.googleapp.utils.sdp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier = Modifier) {
    Card(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 15.sdp),
        shape = customShapes.small,
        elevation = CardDefaults.cardElevation()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 8.sdp, horizontal = 10.sdp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.sdp)
        ) {

            Icon(
                imageVector = Icons.Default.Search, contentDescription = stringResource(
                    R.string.cd_search_icon
                ),
                modifier = Modifier.size(20.sdp)
            )

            Text(
                modifier = Modifier.weight(1f),
                text = stringResource(R.string.ask_anything),
                style = MaterialTheme.typography.bodyMedium
            )

            IconButton(
                modifier = Modifier.size(20.sdp),
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = stringResource(R.string.cd_search_icon),
                    modifier = Modifier.size(20.sdp)
                )

            }
            Spacer(modifier = Modifier.width(4.sdp))
            IconButton(
                modifier = Modifier.size(20.sdp),
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = stringResource(R.string.cd_google_lens),
                    modifier = Modifier.size(20.sdp)
                )

            }
        }
    }
}

@Preview
@Composable
fun SearchPrev() {
    Search()
}
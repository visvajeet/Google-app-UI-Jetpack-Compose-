package com.os.sample.googleapp.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.os.sample.googleapp.R
import com.os.sample.googleapp.data.model.News
import com.os.sample.googleapp.ui.theme.customShapes
import com.os.sample.googleapp.utils.sdp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsCard(modifier: Modifier = Modifier, news: News) {
    Column(
        modifier.fillMaxWidth()
    ) {

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(news.newsImageUrl)
                .crossfade(true)
                .build(),
            contentDescription = stringResource(R.string.cd_news_image),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(horizontal = 10.sdp)
                .clip(customShapes.medium)
                .background(MaterialTheme.colorScheme.surface)
                .fillMaxWidth()
                .aspectRatio(1.6f)
        )

        Text(
            text = news.body,
            style = MaterialTheme.typography.titleLarge,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(all = 10.sdp)
        )

        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.sdp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(news.sourceImageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = stringResource(R.string.cd_news_source_image),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(customShapes.medium)
                    .background(MaterialTheme.colorScheme.surface)
                    .size(14.sdp)
            )

            Text(
                text = news.source,
                style = MaterialTheme.typography.labelSmall,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 5.sdp)
            )
        }

        Divider(
            Modifier
                .fillMaxWidth()
                .padding(top = 12.sdp, bottom = 15.sdp)
                .alpha(0.1f),
            color = MaterialTheme.colorScheme.primary,
            thickness = 1.sdp,
        )

    }
}

@Preview
@Composable
fun NewsCardPrev() {
    NewsCard(news = News.DUMMY)
}

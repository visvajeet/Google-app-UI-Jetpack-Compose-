package com.os.sample.googleapp.ui.theme.screens.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.os.sample.googleapp.data.model.News
import com.os.sample.googleapp.ui.theme.components.Header
import com.os.sample.googleapp.ui.theme.components.NewsCard
import com.os.sample.googleapp.ui.theme.components.Search
import com.os.sample.googleapp.utils.sdp

@Composable
fun HomeScreen() {

    Surface(
        Modifier
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(vertical = 10.sdp),
            content = {
                item {
                    Header()
                }
                item {
                    Search(Modifier.padding(top = 20.sdp, bottom = 20.sdp))
                }
                repeat(4) {
                    item {
                        NewsCard(news = News.DUMMY)
                    }
                }
            })
    }

}
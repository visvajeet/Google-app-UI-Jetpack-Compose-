package com.os.sample.googleapp.data.model

import java.util.*

data class News(
    val id: String,
    val title: String,
    val body: String,
    val source: String,
    val newsImageUrl: String,
    val sourceImageUrl: String,
    val date: Date
) {
    companion object {
        val DUMMY = News(
            id = "id",
            title = "Why did Gotabaya Rajapaksa choose to flee to the Maldives?",
            body = "Sri Lanka’s President Gotabaya Rajapaksa fled overnight to Maldives on an Air Force aircraft. According to reports," +
                    " Gotabaya was taken to a resort after landing in Male in " +
                    "the early hours of Wednesday (July 13). His further plans were not clear.",
            source = "The Indian Express",
            newsImageUrl = "https://images.indianexpress.com/2022/07/sri-lanka-1200-1.jpg",
            sourceImageUrl = "https://play-lh.googleusercontent.com/dSS5OclMxGTasbTH1PYsxZ9bmXZyv7xcU4elR7afSqXns-6MEo1ZYteZi-l75E3g5kY",
            date = Date()
        )
    }
}

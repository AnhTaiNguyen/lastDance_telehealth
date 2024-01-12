package com.works.lastdance.patient.services

import android.util.Log
import com.works.lastdance.patient.models.NewsData
import org.jsoup.nodes.Document
import org.jsoup.Jsoup
import org.jsoup.select.Elements
import java.util.logging.Logger

class WebNewsService {
    fun newsList() : List<NewsData> {
        val arr = mutableListOf<NewsData>()
        val url = "https://baochinhphu.vn/bo-y-te.html"
        val document: Document = Jsoup.connect(url).timeout(15000).get()
        val elements: Elements = document.getElementsByClass("box-stream-link-with-avatar")

        for (item in elements) {
            val img = item.getElementsByTag("img")

            val title = img.attr("alt")
            val src = img.attr("src")
            val href = item.attr("abs:href")

            Log.d("WebNewsService", "Title: $title, Src: $src, Href: $href")

            if (title.isNotBlank() && src.isNotBlank() && href.isNotBlank()) {
                val news = NewsData(title, src, href)
                arr.add(news)
            } else {
                Log.d("WebNewsService", "Skipped an element because title, src, or href is blank")
            }
        }

// Check if arr is null or empty
        if (arr.isEmpty()) {
            // arr is either null or empty
            Log.d("WebNewsService", "arr is null or empty")
        } else {
            // arr has elements
            Log.d("WebNewsService", "arr has ${arr.size} elements")
        }

        return arr
    }
}
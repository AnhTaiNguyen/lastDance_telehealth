package com.works.lastdance.patient.services

import com.works.lastdance.patient.models.NewsData
import org.jsoup.nodes.Document
import org.jsoup.Jsoup
import org.jsoup.select.Elements

class WebNewsService {
    fun newsList() : List<NewsData> {
        val arr = mutableListOf<NewsData>()
        val url = "https://suckhoedoisong.vn"
        val document: Document = Jsoup.connect(url).timeout(15000).get()
        val elements: Elements = document.getElementsByClass("box-category-link-with-avatar")

        for (item in elements) {
            val img = item.getElementsByTag("img")
            val title = item.getElementsByTag("a").attr("title")
            val src = img.attr("src")
            val href = item.getElementsByTag("a").attr("href")


            if (title.isNotBlank() && src.isNotBlank() && href.isNotBlank()) {
                val news = NewsData(title, src, href)
                arr.add(news)
            }
            if (arr.size >= 30) {
                break
            }
        }

        return arr
    }
}
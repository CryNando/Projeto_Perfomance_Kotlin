package com.example.projeto_perfomance_kotlin.models

data class NewsApi(
    var articles: List<Article?>?,
    var status: String?,
    var totalResults: Int?
)

data class Article(
    var source: Source?,
    var author: String?,
    var content: String?,
    var description: String?,
    var publishedAt: String?,
    var title: String?,
    var url: String?,
    var urlToImage: String?
)

data class Source(
    var id: Any?,
    var name: String?
)

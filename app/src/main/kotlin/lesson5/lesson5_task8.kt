package org.example.app.lesson5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val doc: Document = Jsoup.connect(url).get()

    val quotes: Elements = doc.select("div.citation__text")

    for ((index, quote) in quotes.withIndex()) {
        println("${index + 1}. ${quote.text()}\n")
    }
}
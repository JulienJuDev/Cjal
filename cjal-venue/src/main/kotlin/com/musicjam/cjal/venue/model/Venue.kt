package com.musicjam.cjal.venue.model

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.time.LocalTime

@Document
data class venue(
    var id: String,
    var eventTitle: String? = null,
    var place: Place,
    var date: LocalDate,
    var startingAt: LocalTime? = null,
    var endingAt: LocalTime? = null,
    var price: Price? = null,
    var genre: String?
)
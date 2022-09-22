package com.musicjam.cjal.venue.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Place(
    @Id
    var id: String?,
    var name: String,
    var localization: String?,
    var address: Address?
)

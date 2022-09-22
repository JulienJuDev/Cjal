package com.musicjam.cjal.venue.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Address(
    @Id
    var id: String?,
    var name: String?,
    var line1: String?,
    var line2: String?,
    var postalCode: String?,
    var city: String?,
    var country: String?
)

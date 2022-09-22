package com.musicjam.cjal.venue.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal


@Document
data class Price(
    @Id
    var id: String?,
    var amount: BigDecimal,
    var currency: Currency
    
)
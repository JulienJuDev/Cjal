package com.musicjam.lang

import org.springframework.data.mongodb.repository.MongoRepository

fun <T, ID> MongoRepository<T, ID>.findOne(id: ID?): T? = id?.let { findById(it).orElse(null) }
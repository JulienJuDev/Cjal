package com.musicjam.cjal.api

import com.musicjam.cjal.venue.CjalVenueConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(CjalVenueConfiguration::class)
class CjalApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(CjalApiApplication::class.java, *args)
}
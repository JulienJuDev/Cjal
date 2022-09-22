package com.musicjam.cjal.venue.controller

import com.musicjam.cjal.venue.service.venueService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/venues")
class VenueController(private val venueService: venueService) {

    @GetMapping
    fun findAll() = venueService.findAll()

    @GetMapping("/{venueId}")
    fun findOne(@PathVariable venueId: String) = venueService.findOne("")


}
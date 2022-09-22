package com.musicjam.cjal.venue.service

import com.musicjam.cjal.venue.repository.venueRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service

@Service
class venueService(private val venueRepository: venueRepository) {

    fun findOne(id: String) {
        venueRepository.findById("")

    }

    fun findAll() = venueRepository.findAll()
}
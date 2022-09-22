package com.musicjam.cjal.venue.repository

import com.musicjam.cjal.venue.model.venue
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface venueRepository : MongoRepository<venue, String>
package com.musicjam.cjal.venue

import CjalCoreConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@ComponentScan
@EnableMongoRepositories
@Import(CjalCoreConfiguration::class)
class CjalVenueConfiguration
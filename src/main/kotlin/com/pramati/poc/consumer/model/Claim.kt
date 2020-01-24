package com.pramati.poc.consumer.model

import java.time.Instant
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class  Claim(
        val createdBy: String,
        @Id
        val claimId: String,
        val createdDate: Instant
)
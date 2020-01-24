package com.pramati.poc.consumer.repository

import com.pramati.poc.consumer.model.Claim
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ClaimRepository : JpaRepository<Claim,String> {
}
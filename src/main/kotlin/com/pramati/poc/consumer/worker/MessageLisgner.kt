package com.pramati.poc.consumer.worker

import com.pramati.poc.consumer.model.Claim
import com.pramati.poc.consumer.repository.ClaimRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class MessageLisgner {

    @Autowired
    lateinit var claimRepository: ClaimRepository

    @Scheduled(fixedDelay=1000)
    fun consumeMessages()  {
       // println(ClaimRepository.findAll())
       // println(claimRepository.findByConsumed(false))

        for (claim in claimRepository.findByConsumed(false) ) {
            println("Consumed message: " + claim)
            claim.consumed = true
            claimRepository.save(claim)
        }
    }

}
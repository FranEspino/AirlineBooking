package com.example.airlinebooking.domain.model

import java.math.BigDecimal
import java.time.Duration

data class Flight(
    val number:String,
    val aircraft: Aircraft,
    val price:BigDecimal,
    val duration: Duration,
    val departureArrivalBooking:Pair<AirportBooking, AirportBooking>
)

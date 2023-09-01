package com.example.airlinebooking.domain.model.bagage.type

class BigHand : BaggageType(){
    override val emoji: String = super.emoji + super.emoji
    override val title: String = "Big Hang " + super.title
}
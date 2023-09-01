package com.example.airlinebooking.domain.model.bagage.type

class Checked : BaggageType(){
    override val emoji: String = "🎒"
    override val title: String = "Checked " + super.title
}
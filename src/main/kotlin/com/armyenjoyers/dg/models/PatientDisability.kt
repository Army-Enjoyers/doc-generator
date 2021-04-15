package com.armyenjoyers.dg.models

import java.time.LocalDate

data class PatientDisability(
    var startDate: LocalDate,
    val disabilityType: String,
)
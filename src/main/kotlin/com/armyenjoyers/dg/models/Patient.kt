package com.armyenjoyers.dg.models

import java.time.LocalDate

data class Patient(

    var id: String? = null,

    var firstName: String = "",
    var lastName: String= "",
    var patronymic: String= "",
    var birthDate: String = "",
    var gender: Boolean = false,
    //TODO change default values
    var address: Address? = null,
    var citizenship: String= "",
    var job: String?= "",
    var polyclinic: String= "",
    var pensionerId: String?= "",
    var outpatientCardNumber: String= "",
    var additionalInfo: String?= "",

    val disabilities: MutableList<PatientDisability> = mutableListOf(),

    var contingent: String= "",

    var lifeAnamnesis: String?= "",

    var militaryAffiliation: MilitaryAffiliation? = null

)
package com.armyenjoyers.dg.models

import java.time.LocalDate

data class MilitaryAffiliation(

    var militaryRank: MilitaryRank,
    var servicemanCategory: ServicemanCategory,
    var militaryCommissariat: String,
    var conscriptionDate: LocalDate

)
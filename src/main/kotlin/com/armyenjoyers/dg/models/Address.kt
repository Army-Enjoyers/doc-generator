package com.armyenjoyers.dg.models

data class Address(
    val region: String,
    val district: String,
    val locality: String,
    val streetAddress: String,
    val houseNumber: String,
    val placementNumber: String,
    val phoneNumber: String,
    val homePhoneNumber: String,
    val streetType: StreetType,
    val localityType: String,
    val placementType: PlacementType,
)
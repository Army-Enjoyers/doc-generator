package com.armyenjoyers.dg.schemas

open class Card {
    fun getEntityName(): String {
        return this::class.simpleName ?: throw Exception()
    }
}
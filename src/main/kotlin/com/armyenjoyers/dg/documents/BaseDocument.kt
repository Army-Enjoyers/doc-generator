package com.armyenjoyers.dg.documents

import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule
import com.fasterxml.jackson.dataformat.xml.XmlMapper

open class BaseDocument {
    fun serialize(): String {

        val jacksonXmlModule = JacksonXmlModule().apply { setDefaultUseWrapper(false) }
        val xmlMapper = XmlMapper(jacksonXmlModule).enable(SerializationFeature.INDENT_OUTPUT)

        return xmlMapper.writeValueAsString(this)
    }

    fun getSimpleName(): String = this::class.simpleName ?: throw Exception()
}
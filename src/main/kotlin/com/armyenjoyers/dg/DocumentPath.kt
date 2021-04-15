package com.armyenjoyers.dg

import java.net.URI

object DocumentPath {
    private const val docxExtension = "docx"
    private const val templateDirectory = "templates"

    fun generateDocumentPath(className: String): URI {
        val templatePath = "$templateDirectory/$className.$docxExtension"
        return getResourcesPath(templatePath)
    }

    private fun getResourcesPath(path: String): URI = ClassLoader.getSystemResource(path).toURI()
}
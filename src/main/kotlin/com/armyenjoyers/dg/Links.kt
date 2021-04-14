package com.armyenjoyers.dg

import java.net.URI

class Links {
    companion object {
        private const val templateDirectory = "templates"
        private const val docxExtension = "docx"

        fun generateLink(className: String): URI {
            val templatePath = "$templateDirectory/$className.$docxExtension"
            return getResourcesPath(templatePath)
        }

        private fun getResourcesPath(path: String): URI {
            return ClassLoader.getSystemResource(path).toURI()
        }
    }
}
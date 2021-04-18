package com.armyenjoyers.dg

import com.armyenjoyers.dg.documents.BaseDocument
import com.armyenjoyers.dg.documents.OutpatientCard
import com.armyenjoyers.dg.models.Patient
import org.docx4j.Docx4J
import java.io.ByteArrayOutputStream
import java.io.File

object DocGenerator {
    fun generate(document: BaseDocument): ByteArrayOutputStream {
        val wordTemplate = DocumentPath.generateDocumentPath(document.getSimpleName())
        val wordMLPackage = Docx4J.load(File(wordTemplate))
        val xmlData = document.serialize()
        Docx4J.bind(wordMLPackage, xmlData, Docx4J.FLAG_NONE)

        val stream = ByteArrayOutputStream()
        Docx4J.save(wordMLPackage, stream, Docx4J.FLAG_NONE)

        return stream
    }
}

fun main() {
    val xml = OutpatientCard(Patient()).serialize()
    val stream  = ByteArrayOutputStream()
    stream.write(xml.toByteArray())
    stream.writeTo(File("Outpatient.xml").outputStream())
}
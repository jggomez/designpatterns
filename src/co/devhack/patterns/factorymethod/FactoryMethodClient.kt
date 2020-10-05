package co.devhack.patterns.factorymethod

import co.devhack.patterns.decorator.LoggerFactory

fun main(args: Array<String>) {

    val factory = LoggerFactory()
    val logger = factory.getLogger()

    logger.log("Workshop de Arquitectura de Software")
}
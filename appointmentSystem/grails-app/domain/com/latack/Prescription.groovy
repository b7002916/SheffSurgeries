package com.latack

class Prescription {

String pharmacyName
String prescripNumber
String medicine
float totalCost
Date dateIssued
Boolean patientPaying





    static constraints = {

pharmacyName blank: false, nullable: false, maxSize: 50
prescripNumber blank: false, nullable: false, maxSize: 5, unique: true
medicine blank: false, nullable: false 
totalCost blank: false, nullable: false, scale: 2
dateIssued blank: false, nullable: false
patientPaying blank: false, nullable: false

    }
}

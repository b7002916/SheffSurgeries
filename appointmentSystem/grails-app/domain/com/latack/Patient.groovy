package com.latack

class Patient {

String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone

Appointment appointments
Prescription prescriptions

static hasMany=[surgeries: Surgery, doctors: Doctor]


    static constraints = {

patientName blank: false, nullable: false, maxSize: 25
patientAddress blank: false, nullable: false, maxSize: 50
patientResidence blank: false, nullable: false, maxSize: 20
patientDob blank: false, nullable: false
patientID blank: false, nullable: false, unique: true, maxSize: 6
dateRegistered blank: false, nullable: false
patientPhone blank: false, nullable: false, size: 11..11

    }
}

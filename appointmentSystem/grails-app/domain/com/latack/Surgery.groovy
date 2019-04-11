package com.latack

class Surgery {

String name
String address
String postcode
String telephone
int numberOfPatients
String description
String openingTime

Doctor doctors
Receptionist receptionist
Nurse nurses

static hasMany=[patients: Patient, appointments: Appointment]


    static constraints = {

name blank: false, nullable: false, maxSize: 25
address blank: false, nullable: false, maxSize: 50
postcode blank: false, nullable: false, maxSize: 8
telephone blank: false, nullable: false, size: 11..11
numberOfPatients blank: false, nullable: false
description blank: false, nullable: false, widget: 'Description', maxSize: 100
openingTime blank: false, nullable: false, size: 14..14

    }
}

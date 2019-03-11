package com.latack

class Surgery {

String name
String address
String postcode
int telephone
int numberOfPatients
String description
String openingTime


    static constraints = {

name blank: false, nullable: false, maxSize: 25
address blank: false, nullable: false, maxSize: 50
postcode blank: false, nullable: false, maxSize: 8
telephone blank: false, nullable: false, min:11, max:11
numberOfPatients blank: false, nullable: false
description blank: false, nullable: false, widget: 'Description', maxSize: 100
openingTime blank: false, nullable: false, minSize: 14, maxSize: 14

    }
}

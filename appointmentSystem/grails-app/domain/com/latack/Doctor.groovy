package com.latack

class Doctor {

String fullName
String qualification
String position
String doctorEmail 
String password
String doctorOffice
String doctorPhone
String bio

    static constraints = {

fullName blank: false, nullable: false, maxSize: 30
qualification blank: false, nullable: false, maxSize: 100
position blank: false, nullable: false, maxSize: 20
doctorEmail blank: false, nullable: false, email: true
password blank: false, nullable: false, minSize: 5
doctorOffice blank: false, nullable: false, size: 6..6
doctorPhone blank: false, nullable: false, size: 11..11
bio maxSize: 100

    }
}

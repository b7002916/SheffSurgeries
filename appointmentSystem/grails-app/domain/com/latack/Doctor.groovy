package com.latack

class Doctor {

String fullName
String qualification
String position
String doctorEmail 
String password
String doctorOffice
int doctorPhone
String bio

    static constraints = {

fullName blank: false, nullable: false, maxSize: 30
qualification blank: false, nullable: false, widget: 'Qualifications', maxSize: 100
position blank: false, nullable: false, maxSize: 20
doctorEmail blank: false, nullable: false, email: true
password blank: false, nullable: false, minSize: 5
doctorOffice blank: false, nullable: false, size: 6..6
doctorPhone blank: false, nullable: false, min: 11, max: 11
bio widget: 'Bio', maxSize: 100

    }
}

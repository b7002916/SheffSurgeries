package com.latack

class Nurse {

String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone


    static constraints = {

nurseName blank: false, nullable: false, maxSize: 25
qualifications blank: false, nullable: false, widget: 'Qualifications', maxSize: 100
nurseEmail blank: false, nullable: false, email: true
nurseOffice blank: false, nullable: false, size: 5..5
nursePhone blank: false, nullable: false, size: 11..11
    }
}

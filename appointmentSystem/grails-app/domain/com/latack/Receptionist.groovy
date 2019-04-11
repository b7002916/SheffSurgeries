package com.latack

class Receptionist {

String recepName
String recepEmail
String recepUsername
String recepPassword
String recepPhone

static hasMany=[surgeries: Surgery]

    static constraints = {

recepName blank: false, nullable: false, maxSize: 25
recepEmail blank: false, nullable: false, email: true
recepUsername blank: false, nullable: false, unique: true
recepPassword blank: false, nullable: false, minSize: 6
recepPhone blank: false, nullable: false, size: 11..11

    }
}

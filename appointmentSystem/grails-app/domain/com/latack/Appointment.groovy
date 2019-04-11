package com.latack

class Appointment {

Date appDate
float appTime
int appDuration
String roomNumber
Patient patients
Surgery surgeries

static hasMany=[doctors: Doctor]




    static constraints = {

appDate blank: false, nullable: false
appTime blank: false, nullable: false, scale: 2
appDuration blank: false, nullable: false, min: 15, max: 60
roomNumber blank: false, nullable: false, size: 6..6 

    }
}

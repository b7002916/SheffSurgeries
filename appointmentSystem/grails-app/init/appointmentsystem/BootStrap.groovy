package com.latack

class BootStrap {

    def init = { servletContext ->

def SusanPeters = new Nurse (

nurseName: 'Susan Peters',
qualifications: 'Registered General Nurse',
nurseEmail: 's.peters@myemail.com',
nurseOffice: 'B-455',
nursePhone: '01142224433'

).save()

def StevenSmith = new Nurse (

nurseName: 'Steven Smith',
qualifications: 'Registered General Nurse',
nurseEmail: 's.smith@myemail.com',
nurseOffice: 'B-793',
nursePhone: '01142224433'

).save()

    }
    def destroy = {
    }
}

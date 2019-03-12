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

def SarahMcdonald = new Doctor (

fullName: 'Dr Sarah Macdonald',
qualification: 'MBChB(Sheffield)',
position: 'GP, Surgeon',
doctorEmail: 's.macdonald@myemail.com',
password: 'secret222',
doctorOffice: 'D-9888',
doctorPhone: '01477684089',
bio: 'Lorem accumsan.'

).save()

def JackMcgue = new Doctor (

fullName: 'Dr Jack Mcgue',
qualification: 'pHD Pharmeutical Science(Sheffield)',
position: 'GP, Surgeon',
doctorEmail: 'j.mcgue@myemail.com',
password: 'secret255',
doctorOffice: 'A-7688',
doctorPhone: '01477684088',
bio: 'Lorem accumsan.'

).save()

    }
    def destroy = {
    }
}

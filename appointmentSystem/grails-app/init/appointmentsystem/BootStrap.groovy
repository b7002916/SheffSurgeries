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

def Appointment1 = new Appointment (

appDate: new Date('11/04/2019'),
appTime: '15.00',
appDuration: 30,
roomNumber: 'A-1111',

).save()

def Appointment2 = new Appointment (

appDate: new Date('16/04/2019'),
appTime: '09.00',
appDuration: 60,
roomNumber: 'A-2387',

).save() 

def CityHealthCentre = new Surgery (

name: 'City Health Centre',
address: '21 Marble Street, Sheffield',
postcode: 'S11 5TY',
telephone: '01145555555',
numberOfPatients: 50,
description: 'Lorem accumsan.',
openingTime: '09:00-17:00hrs'

).save()

def FarmHealthCentre = new Surgery (

name: 'Farm Health Centre',
address: '21 Arundel Gate, Sheffield',
postcode: 'S2 4PQ',
telephone: '01145558955',
numberOfPatients: 25,
description: 'Lorem accumsan.',
openingTime: '09:00-17:00hrs'

).save()

def RobKingston = new Receptionist (

recepName: 'Rob Kingston',
recepEmail: 'r.kingston@email.com',
recepUsername: 'rking',
recepPassword: 'secret2019',
recepPhone: '01142224445'

).save()

def JamesPegg = new Receptionist (

recepName: 'James Pegg',
recepEmail: 'j.pegg@email.com',
recepUsername: 'jPegg',
recepPassword: 'secret2019',
recepPhone: '01142224335'

).save()

def CityCentrePharmacy = new Prescription (

pharmacyName: 'City Centre Pharmacy',
prescripNumber: 56788,
medicine: 'Paracetamol',
totalCost: '5.90',
dateIssued: new Date('19/06/2019'),
patientPaying: true

).save()

def FarmPharmacy = new Prescription (

pharmacyName: 'Farm Pharmacy',
prescripNumber: 48905,
medicine: 'Xanax',
totalCost: '52.50',
dateIssued: new Date('20/06/2019'),
patientPaying: true

).save()

def TomRivers = new Patient (

patientName: 'Tom Rivers',
patientAddress: '2 One Way Street, Eckington',
patientResidence: 'Doncaster',
patientDob: new Date('20/06/1996'),
patientID: 'E25555',
dateRegistered: new Date('12/03/2019'),
patientPhone: '01142224444'

).save()


    }
    def destroy = {
    }
}

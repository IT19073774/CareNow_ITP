package com.carenow.spring.datajpa.controller_IT19073774;

import org.springframework.data.domain.Sort;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carenow.spring.datajpa.model.*;
import com.carenow.spring.datajpa.repository_IT19073774.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CareNowController {
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	AppointmentServices appointmentServices;
	
	@GetMapping(path = "/getPatAppo/{patID}")
	List<Appointment> getPatAppo(@PathVariable String patID) {
		return appointmentServices.findByPatientId(patID,Sort.by(Sort.Direction.DESC,"startTime"));
	}
	
	@GetMapping(path = "/getAppointments")
	List<Appointment> getAppointments() {
		return appointmentServices.findAll(Sort.by(Sort.Direction.DESC,"startTime"));
	}
	
	@RequestMapping(path = "/getAppointmentsToday/{start}")
	public List<Appointment> getAppointmentsToday(@PathVariable String start) {
		return appointmentServices.findByStartTimeLike("%"+start+"%",Sort.by(Sort.Direction.ASC,"startTime"));
	}
		
	@PostMapping(path = "/addAppointment")
	Appointment addAppointment(@RequestBody Appointment appo) {
		return appointmentServices.save(appo);
	}
	
	@DeleteMapping("/deleteAppointment/{id}")
	void deleteAppointment(@PathVariable int id) {
		appointmentServices.deleteById(id);
	}
	
	@PutMapping("/updateAppointment")
	Appointment updateAppointment(@RequestBody Appointment appo) {
		return appointmentServices.save(appo);
	}
	
	@GetMapping(path = "/getDocsAppointments/{id}")
	List<Appointment> getDocsAppointments(@PathVariable String id) {
		List<Appointment> docAppo =  new ArrayList<Appointment>();
		List<Appointment> appointment =  getAppointments();
		List<Patient> patient = getPatientbydoc(id);
		for (int i=0; i<appointment.size(); i++) {
			for (int j=0; j<patient.size(); j++) {
				if (patient.get(j).getPatientId().toString().equals(appointment.get(i).getPatientId())) {
					docAppo.add(appointment.get(i));
				}
			}
		}
		return docAppo;
	}
	
	@GetMapping(path = "/DocDiagnose/{start}/{end}")
	List<Diagnose> DocDiagnose(@PathVariable String start, @PathVariable String end) {
		List<Appointment> appointment = getAppointmentAttendance(start, end);
		List<Diagnose> diagnose =  new ArrayList<Diagnose>();
		for (int i = 0; i < appointment.size(); i++) {
			if (appointment.get(i).getStatusId().equals("2")) {
				Diagnose diag = new Diagnose();
				Optional<Patient> patient = getPatient(Integer.parseInt(appointment.get(i).getPatientId()));
				Patient pat = patient.get();
				Optional<Employee> employee = getEmployee(Integer.parseInt(pat.getFamilyDoctorId().substring(4)));
				Employee emplo = employee.get();
				diag.setDoctor(emplo.getFirstName() + " " + emplo.getLastName() + " - " +pat.getFamilyDoctorId());
				diag.setPatient(appointment.get(i).getSubject());
				diag.setDate(appointment.get(i).getStartTime());
				diag.setDuration(appointment.get(i).getEndTime());
				diagnose.add(diag);
			}
		}
		return diagnose;
	}
	
	@GetMapping(path = "/getAppointmentAttendance/{start}/{end}")
	List<Appointment> getAppointmentAttendance(@PathVariable String start, @PathVariable String end) {
		return appointmentServices.findByStartTimeGreaterThanEqualAndStartTimeLessThanEqual(start,end,Sort.by(Sort.Direction.ASC,"startTime"));
	}
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	EmployeeServices employeeServices;
	
	@GetMapping(path = "/getEmployees")
	List<Employee> getEmployees() {
		return employeeServices.findAll();
	}

	Optional<Employee> getEmployee(@PathVariable int id) {
		return employeeServices.findById(id);
	}
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	LoginServices loginServices;
	
	@PostMapping(path = "/Authenticate")
	boolean getEmployees(@RequestBody Login credentials) {
		List<Login> logins = loginServices.findAll();
		for (int i = 0; i < logins.size(); i++) {
		    if (logins.get(i).getEmail().equals(credentials.getEmail()) && 
		    		logins.get(i).getPassword().equals(credentials.getPassword())) {
		    	return true;
		    }
		}
		return false;
	}
	

	Login addLogin(String email, String psw) {
		Login cred = new Login();
		cred.setEmail(email);
		cred.setPassword(psw);
		return loginServices.save(cred);
	}
	
	
	void deleteLogin(String email) {
		loginServices.deleteByEmail(email);
	}
	
	@PutMapping(path = "/updateLogin")
	Login updateLogin(@RequestBody Login credentials) {
		deleteLogin(credentials.getEmail());
		return loginServices.save(credentials);
	}
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	MemoServices memoServices;
	
	@PostMapping(path = "/createMemo")
	Memo createMemo(@RequestBody Memo memo) {
		return memoServices.save(memo);
	}
	
	@GetMapping(path = "/getMemos")
	List<Memo> getMemos() {
		return memoServices.findAll(Sort.by(Sort.Direction.DESC,"memoDate"));
	}
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	DoctorServices doctorServices;
	
	@GetMapping(path = "/getDoctor/{id}")
	Optional<Doctor> getDoctor(@PathVariable int id) {
		return doctorServices.findById(id);
	}
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	PatientServices patientServices;
	
	@GetMapping(path = "/getPatients")
	List<Patient> getPatients() {
		return patientServices.findAll();
	}
	
	@GetMapping(path = "/getPatient/{id}")
	Optional<Patient> getPatient(@PathVariable int id) {
		return patientServices.findById(id);
	}
	
	@PostMapping(path = "/addPatient/{password}")
	Patient addPatient(@RequestBody Patient pat,@PathVariable String password) {
		addLogin(pat.getPatientEmail(), password);
		return patientServices.save(pat);
	}
	
	@PutMapping(path = "/updateFamDoc")
	Patient updateFamDoc(@RequestBody Patient pat) {

		return patientServices.save(pat);
	}
	
	@DeleteMapping("/deletePatient/{id}")
	void deletePatient(@PathVariable int id) {
		Optional<Patient> patOpt = getPatient(id);
		Patient pat = patOpt.get();
		deleteLogin(pat.getPatientEmail());
		patientServices.deleteById(id);
	}
	
	@GetMapping(path = "/getPatientDoc/{doc}")
	List<Patient> getPatientbydoc(@PathVariable String doc) {
		return patientServices.findByFamilyDoctorId(doc);
	}
	
	
////////////////////////////////////////////////////////////////////////////////
	@Autowired
	ShiftServices shiftServices;
	
	@GetMapping(path = "/getShiftDoc/{doc}")
	List<Shift> getShifttbydoc(@PathVariable String doc) {
		return shiftServices.findByDoctorId(doc,Sort.by(Sort.Direction.ASC,"shiftDay"));
	}
	
	@PutMapping(path = "/updateShift")
	Shift updateShift(@RequestBody Shift shift) {
		return shiftServices.save(shift);
	}
	
	@GetMapping(path = "/getShift")
	List<Shift> getShift() {
		return shiftServices.findAll(Sort.by(Sort.Direction.ASC,"boxId"));
	}
	
	@GetMapping(path = "/getShiftToday/{day}")
	List<Shift> getShiftToday(@PathVariable String day) {
		return shiftServices.findByShiftDay(day,Sort.by(Sort.Direction.ASC,"shiftSlotStart"));
	}
	
	
	@GetMapping(path = "/getShiftTodaySolution/{day}")
	List<ShiftToday> getShiftTodaySolution(@PathVariable String day) {
		ShiftToday previous = new ShiftToday();
		String previousDoc = "";
		
		List<Shift> shift = getShiftToday(day);
		List<ShiftToday> shiftstoday =  new ArrayList<ShiftToday>();
		for (int i = 0; i < shift.size(); i++) {
			String docStr = shift.get(i).getDoctorId().substring(4);
			if (docStr.equals("")) {
				if (!previousDoc.equals("")) {
					shiftstoday.add(previous);
					previousDoc = "";
				}
			} else {
				int docID = Integer.parseInt(docStr);
				
				Optional<Employee> empOptional = getEmployee(docID);
				Employee emp = empOptional.get();
				Optional<Doctor> docOptional = getDoctor(docID);
				Doctor doc = docOptional.get();
				ShiftToday shifttod1 = new ShiftToday();
				shifttod1.setEmployeeId(docID);
				shifttod1.setDoctorId("DOC0" + docID);
				shifttod1.setFirstName(emp.getFirstName());
				shifttod1.setLastName(emp.getLastName());
				shifttod1.setContactNo(emp.getContactNo());
				shifttod1.setEducation(doc.getEducation());
				shifttod1.setColor(doc.getColor());
				shifttod1.setShiftDay(shift.get(i).getShiftDay());
				shifttod1.setShiftSlotStart(shift.get(i).getShiftSlotStart());
				shifttod1.setShiftSlotEnd(shift.get(i).getShiftSlotEnd());
				
				//shiftstoday.add(shifttod1);
				if (previousDoc.equals(shifttod1.getDoctorId())) {
					previous.setShiftSlotEnd(shifttod1.getShiftSlotEnd());
					if (i == shift.size()-1) {
						shiftstoday.add(previous);
					}
				} else {
					if (i == shift.size()-1) {
						if (!previousDoc.equals("")) {
							shiftstoday.add(previous);
							previousDoc = "";
						}
						shiftstoday.add(shifttod1);
					} else {
						if (!previousDoc.equals("")) {
							shiftstoday.add(previous);
							previousDoc = "";
						}
						previous = shifttod1;
						previousDoc = shifttod1.getDoctorId();
					}
				}
			}
		}
		return shiftstoday;
	}
	
}

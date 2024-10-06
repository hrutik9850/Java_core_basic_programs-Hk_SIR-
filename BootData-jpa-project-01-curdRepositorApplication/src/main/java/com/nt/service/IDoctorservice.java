package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;

public interface IDoctorservice {
	public String registerDoctor(Doctor doctor);
	public String registerAllpatients(List<Doctor> list);
	public String registerOrUppdateDoctor(Doctor doctor);
	public String updateDocterLocation(int Id ,String newlocation);
	public String deleteDocterById(Integer Id);
	public String reamauallDoctetr();
	public String reamauDocterById(Iterable<Integer> ids);
	public String remauDocterBYId(Integer ids);

}

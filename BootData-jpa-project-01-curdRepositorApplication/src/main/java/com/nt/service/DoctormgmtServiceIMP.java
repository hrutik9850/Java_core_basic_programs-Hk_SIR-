package com.nt.service;

import java.util.List;
import java.util.Optional;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorrepo;
@Service("Doctorservice")
public class DoctormgmtServiceIMP implements IDoctorservice {
	
	@Autowired
	private IDoctorrepo doctorrepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("doc id (before save ::"+doctor.getDocId());
		
		Doctor doc = doctorrepo.save(doctor);
		
		return "Doctor obj is soved  with Id  value = :"+doc.getDocId();
	}

	@Override
	public String registerAllpatients(List<Doctor> list) {
	Iterable <Doctor> saveedlist =	doctorrepo.saveAll(list);
		return list.size()+"Docter are saved";
	}

	@Override
	public String registerOrUppdateDoctor(Doctor doctor) {
	Optional<Doctor> opt = doctorrepo.findById(doctor.getDocId());
	if(opt.isPresent()) {
		doctorrepo.save(doctor);
		return doctor.getDocId()+"doctor detile are find and update ";
	}else {
		return "Doctor is saved with id value:"+ doctorrepo.save(doctor).getDocId();
	}
	}

	@Override
	public String updateDocterLocation(int Id, String newlocation) {
	Optional<Doctor> opt = doctorrepo.findById(Id);
	if(opt.isPresent()) {
		Doctor dot = opt.get();
		dot.setCurent_Addres(newlocation);
		doctorrepo.save(dot);
		return Id+" this Id curent location  will be chan "+newlocation;
	}
	else {
		
		return Id+" this Id recored  will  not exites ";
		
	}
	}

	@Override
	public String deleteDocterById(Integer Id) {
		
			Optional<Doctor> doct = doctorrepo.findById(Id);
			if(doct.isPresent()) {
				Doctor deletedoct = doct.get();
				doctorrepo.delete(deletedoct);
				return Id +" this id docter will be beleted :";
			}
			else return Id+" this id docter is not found";
	
	}

	@Override
	public String reamauallDoctetr() {
	long recored = doctorrepo.count();
	if(recored > 0) {
		doctorrepo.deleteAll();
		return recored +" number of recored are deleted:";
	}else {
		return " no recored found :";
		}
	
		
	}

	@Override
	public String reamauDocterById(Iterable<Integer> ids) {
		List<Doctor> list = (List<Doctor>) doctorrepo.findAllById(ids);
		doctorrepo.deleteAllById(ids);
				return list.size()+"number of recoreds are deleated ";
	}

	@Override
	public String remauDocterBYId(Integer ids) {
	Optional<Doctor> optional = doctorrepo.findById(ids);
	if(optional.isPresent())
	{
		doctorrepo.deleteById(ids);;
		return ids + "delete a recored ";
	}
	else return ids+ " ids  recored not  found";
	}

	

}

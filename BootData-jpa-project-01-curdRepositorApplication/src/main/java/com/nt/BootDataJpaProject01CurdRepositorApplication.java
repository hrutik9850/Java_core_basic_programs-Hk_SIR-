package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Doctor;
import com.nt.service.DoctormgmtServiceIMP;
import com.nt.service.IDoctorservice;

@SpringBootApplication
public class BootDataJpaProject01CurdRepositorApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProject01CurdRepositorApplication.class, args);
		IDoctorservice service = ctx.getBean("Doctorservice", DoctormgmtServiceIMP.class);
			/*try {
				Doctor doct1 = new Doctor();
				doct1.setDocName("raja");
				doct1.setSpecialization("MD-CARDIO");
				doct1.setIcome(890000.0);
				Doctor doct2 = new Doctor();
				doct2.setDocName("karam sharma");
				doct2.setSpecialization("HARED");
				doct2.setIcome(590000.0);
				Doctor doct3 = new Doctor();
				doct3.setDocName("GANASHA AGRAVAR");
				doct3.setSpecialization("BARAN-LOGIS");
				doct3.setIcome(890000.0);
				List <Doctor> list = List.of(doct1,doct2,doct3);
				String resultmsgString = service.registerAllpatients(list);
				System.out.println(resultmsgString);
				
			
			} catch (Exception e) {
				e.printStackTrace();
			
			}*/
		
		/*try {
			Doctor doct2 = new Doctor();
			doct2.setDocId(952);
			doct2.setDocName("partika");
			doct2.setSpecialization("Cardio");
			doct2.setIcome(4440000.0);
			doct2.setCurent_Addres("nakpur");
			System.out.println(service.registerOrUppdateDoctor(doct2));
		} catch (Exception e) {
			e.printStackTrace();
		
		}*/

		/*	try {
				System.out.println(service.updateDocterLocation(100, "gova"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}*/

		/*try {
			
			System.out.println(service.deleteDocterById(100));
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/

		/*try {
			System.out.println(service.reamauallDoctetr());
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		/*try {
			System.out.println(service.reamauDocterById(List.of( 195,193)));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		try {
			System.out.println(service.deleteDocterById(195));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

package com.nt.entity;


import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.Transient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_DOCTOR_INFO")
@Data

public class Doctor {
	@Column(name="DOCT_ID" )
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer docId;
	@Column(name="DOC_NAME",length =25)
	private String  docName;
	@Column(name="SPECIALIZATION",length = 20)
	private String specialization ;
	@Column(name="C_ADDRES")
	private String curent_Addres ;
	@Transient
	@Column(name="ICOME")
	private Double icome;

}

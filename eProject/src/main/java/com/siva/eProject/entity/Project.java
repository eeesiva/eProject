package com.siva.eProject.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="project", schema="icc")
@Getter
@Setter
@ToString
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="project_sequence")
	@SequenceGenerator(name = "project_sequence", sequenceName = "PROJ_SEQ")
	@Column(name="project_id")
	private Long Id;
	
	@Column(name="ritm_no")
	private String ritm;
	
	@Column(name="project_name")
	private String projectName;
	
	@Column(name="description")
	private String desc;
	
	@Column(name="project_type")
	private String projectType;
	
	@Column(name="billing_type")
	private String billingType;
	
	@Column(name="lt_id")
	private String lt;
	
	@Column(name="created_date")
	private Date createDate;
	
	@Column(name="golive_date")
	private Date goLive;
	
	@Column(name="business_sponsor")
	private String businessSponsor;
	
	@Column(name="GE_MANAGER")
	private Long geMgr;
	
	@Column(name="GE_ARCHITECT")
	private Long geArch;
		
	@Column(name="TECHM_MANAGER")
	private Long techmMgr; 
	
	@Column(name="project_status")
	private String projectStatus;
	
	@Column(name="created_on")
	private Date createdOn;
	
	@Column(name="last_updated")
	private Date updatedOn;
	
	@Column(name="techm_pid")
	private String techmPid;

}
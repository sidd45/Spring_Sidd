package com.nt.controller;

import com.nt.dto.CricketerDTO;
import com.nt.service.CricketerMgmtService;
import com.nt.vo.CricketerVO;

public class MainController{
	private CricketerMgmtService service;

	public MainController(CricketerMgmtService service) {
		this.service = service;
	}
	
	public String processCricketer(CricketerVO vo)throws Exception{
		CricketerDTO dto=null;
		String result=null;
		dto=new CricketerDTO();
		//setting values to dto
		
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setTotalruns(Float.parseFloat(vo.getTotalruns()));
		dto.setTotalmatches(Float.parseFloat(vo.getTotalmatches()));
		dto.setNumofnotouts(Float.parseFloat(vo.getNumofnotouts()));
		dto.setRunsconceded(Float.parseFloat(vo.getRunsconceded()));
		dto.setWicketstaken(Float.parseFloat(vo.getWicketstaken()));
	    
		//calling service
		result=service.caluculateAvg(dto);
		
		//returning result
		return result;
		
	}
	

}

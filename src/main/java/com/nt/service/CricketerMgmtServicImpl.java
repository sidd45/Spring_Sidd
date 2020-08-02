package com.nt.service;

import com.nt.bo.CricketerBO;
import com.nt.dao.CricketerDAO;
import com.nt.dto.CricketerDTO;

public class CricketerMgmtServicImpl implements CricketerMgmtService {
	CricketerDAO dao;

	public CricketerMgmtServicImpl(CricketerDAO dao){
		this.dao = dao;
	}

	@Override
	public String caluculateAvg(CricketerDTO dto) throws Exception {
		CricketerBO bo;
		float batavg = 0.0f, bowlavg = 0.0f;
		int count = 0;

		// cauluculating batavg and bowling avg

		batavg = (dto.getTotalruns() / (dto.getTotalmatches()-dto.getNumofnotouts()));
		bowlavg = (dto.getRunsconceded() / dto.getWicketstaken());
		
		bo=new CricketerBO();
		// setting the values to bo
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setBatavg(batavg);
		bo.setBowlavg(bowlavg);
        //inserting bo object into database
		count = dao.insertCricketer(bo);

		if (count != 0)
			return "Cricketer Registration successful :) \n" + "Batting  and bowling avg of " + dto.getCname()
					+"  "+ "batingavg::=====>" + batavg +" "+ "bowlingavg::=====>" + bowlavg;

		else
			return "Cricketer Registration Failed :(" + "Batting  and bowling avg of \n" + dto.getCname()
			+"  "+ "batingavg::=====>" + batavg +" "+ "bowlingavg::=====>" + bowlavg;

	}

}

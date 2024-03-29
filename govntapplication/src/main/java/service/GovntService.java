package service;

import java.util.List;

import Dto.GovntDto;

public interface GovntService {
	
	
	
	boolean validateandSave(GovntDto dto);
	List<GovntDto> validRead();
	

}

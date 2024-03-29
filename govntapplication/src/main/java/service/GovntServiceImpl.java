package service;

import java.util.ArrayList;
import java.util.List;

import Dto.GovntDto;
import entity.GovntEntity;
import repository.GovntRepo1;
import repository.GovntRepoImpl;

public class GovntServiceImpl implements GovntService {

	GovntRepo1 repo = new GovntRepoImpl();

	@Override
	public boolean validateandSave(GovntDto dto) {
		GovntEntity entity = new GovntEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setContactNumber(dto.getContactNumber());
		entity.setAge(dto.getAge());
		entity.setMotherTounge(dto.getMotherTounge());
		entity.setGender(dto.getGender());
		entity.setMaritalStatus(dto.getMaritalStatus());
		entity.setNationality(dto.getNationality());
		entity.setReligion(dto.getReligion());
		entity.setAddress(dto.getAddress());
		repo.onsave(entity);
		System.out.println(entity);
		return true;
	}
	
	    

	@Override

	public List<GovntDto> validRead() {
		List<GovntEntity> entity = repo.read();
		List<GovntDto> readAll = new ArrayList<GovntDto>();
		if (entity != null) {
			for (GovntEntity customEntity : entity) {
				if (customEntity != null) {
					// if((GovntEntity.getStatus().equalsIgnoreCase(OrderStatus.ACTIVE.toString())))
					// {
					GovntDto dto = new GovntDto();
					dto.setId(customEntity.getId());
					dto.setName(customEntity.getName());
					dto.setEmail(customEntity.getEmail());
					dto.setContactNumber(customEntity.getContactNumber());
					dto.setAge(customEntity.getAge());
					dto.setMotherTounge(customEntity.getMotherTounge());
					dto.setGender(customEntity.getGender());
					dto.setMaritalStatus(customEntity.getMaritalStatus());
					dto.setNationality(customEntity.getNationality());
					dto.setReligion(customEntity.getReligion());
					dto.setAddress(customEntity.getAddress());
					readAll.add(dto);
				}
			}
		}
		return readAll;
	}
}

package repository;

import java.util.ArrayList;
import java.util.List;

import entity.GovntEntity;

public interface GovntRepo1 {
	

boolean onsave(GovntEntity entity);
	
ArrayList<GovntEntity> read();

}

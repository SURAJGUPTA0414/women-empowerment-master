package com.capgemini.repository;

import java.util.List;

import com.capgemini.model.NGO;



public interface INGORepository {
	NGO addNGO(NGO ngo);

	NGO updateNGO(NGO ngo);

	NGO viewNGO(int ngoId);

	List<NGO> viewAllNGO();

	void deleteNGO(int ngoId);

	List<NGO> viewNGOByMotive(String motive);

	List<NGO> viewNGOByLocation(String location);
}

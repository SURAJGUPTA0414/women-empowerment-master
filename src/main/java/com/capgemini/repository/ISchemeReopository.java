package com.capgemini.repository;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.model.Scheme;



public interface ISchemeReopository {
	Scheme addScheme(Scheme scheme);

	Scheme updateScheme(Scheme scheme);

	Scheme viewScheme(int schemeId);

	List<Scheme> viewAllScheme();

	void deleteScheme(int schemeId);

	List<Scheme> viewSchemesByType(String schemeType);

	List<Scheme> viewSchemeByLaunchDate(LocalDate date);
}


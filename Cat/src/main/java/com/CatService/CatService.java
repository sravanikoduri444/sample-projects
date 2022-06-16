package com.CatService;

import com.CatDAO.CatuserDAO;
import com.CatDAO.CatuserDAOInterface;
import com.CatEntity.Catuser;

public class CatService implements CatServiceInterface {

	public int createProfileService(Catuser cu) {
		CatuserDAOInterface cd = new CatuserDAO();
		int i = cd.createProfileDAO(cu);
		return i;
	}

}

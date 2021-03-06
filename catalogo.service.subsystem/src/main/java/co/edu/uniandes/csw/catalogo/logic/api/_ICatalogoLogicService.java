
package co.edu.uniandes.csw.catalogo.logic.api;

import java.util.List; 

import co.edu.uniandes.csw.catalogo.logic.dto.CatalogoDTO;

public interface _ICatalogoLogicService {

	public CatalogoDTO createCatalogo(CatalogoDTO detail);
	public List<CatalogoDTO> getCatalogos();
	public CatalogoDTO getCatalogo(Long id);
	public void deleteCatalogo(Long id);
	public void updateCatalogo(CatalogoDTO detail);
	
}
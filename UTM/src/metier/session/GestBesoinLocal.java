package metier.session;

import java.util.List;

import javax.ejb.Local;


import metier.entities.Besoin;
import metier.entities.Categorie;
import metier.entities.Fournisseur;
import metier.entities.PhotoBesoin;
import metier.entities.Produit;
import metier.entities.UniteDeMesure;


@Local
public interface GestBesoinLocal 
{
	
	// create
	public void ajoutBesoin(Besoin b);
	public void ajoutProduit(Produit p);
	public void ajoutCategorie(Categorie c);
	public void ajoutPhotoBesoin(PhotoBesoin pB);
	public void ajoutUniteDeMesure(UniteDeMesure uM);
	public void ajoutFournisseur(Fournisseur f);

	//delete
	
	public void deleteBesoin(Besoin b);
	public void deleteProduit(Produit p);
	public void deleteCategorie(Categorie c);
	public void deletePhotoBesoin(PhotoBesoin pB);
	public void deleteUniteDeMesure(UniteDeMesure uM);
	public void deleteFournisseur(Fournisseur f);
	
	
	//update
	
	public void updateBesoin(Besoin b);
	public void updateProduit(Produit p);
	public void updateCategorie(Categorie c);
	public void updatePhotoBesoin(PhotoBesoin pB);
	public void updateUniteDeMesure(UniteDeMesure uM);
	public void updateFournisseur(Fournisseur f);
	
	
	//read
	
	public Produit getProduitById(int idP);

	
	public List<Besoin> getAllBesoin();
	public List<Produit> getAllProduit();
	public List<Categorie> getAllCategorie();
	public List<PhotoBesoin> getAllPhotoBesoin();
	public List<UniteDeMesure> getAllUniteDeMesure();
	public List<Fournisseur> getAllFournisseur();
	
	public List<Produit> getProduitByCategorie(int idc);
	public List<Produit> getProduitByFounisseur(int idF);
	public List<Fournisseur> getFournisseurByProduit(int idP);
	
}

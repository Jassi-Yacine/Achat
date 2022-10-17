package tn.esprit.rh.achat.services.produit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import tn.esprit.rh.achat.entities.CategorieFournisseur;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.repositories.FournisseurRepository;
import tn.esprit.rh.achat.services.IFournisseurService;

public class FourniseurServiceTest {
    
    
    
    
    @Autowired
	private FournisseurRepository repo;
	
	
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	IFournisseurService fournisseurService;

	@Test
    @Order(1)
    public void testRetrieveAllFournisseur() {
        List<Fournisseur> listFournisseur = fournisseurService.retrieveAllFournisseurs(); 
        Assertions.assertEquals(0, listFournisseur.size());
    }

    @Test
    @Order(2)
    public void testAddFournisseur() throws ParseException   {
        Fournisseur u = new Fournisseur("CodeSanna", "LAbelleSanna"); 
        Fournisseur FournisseurAdded = fournisseurService.addFournisseur(u); 
      
    }

    @Test
    @Order(3)
    public void testModifyFournisseur() throws ParseException   {
        
        Fournisseur u = new Fournisseur("CodeSanna", "LAbelleSanna"); 
        Fournisseur fournisseurUpdated  = fournisseurService.updateFournisseur(u); 
      
    }
    
}

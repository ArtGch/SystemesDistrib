import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.nancy.fr")
public class MonService {
	
	public static List<Product> produits = new ArrayList<>();
	static {
		produits.add(new Product(1,"Tablette",890));
		produits.add(new Product(2,"Routeur",210));
		produits.add(new Product(3,"Switch",287));
		produits.add(new Product(4,"Cable",863));
	}
	
	@WebMethod(operationName="afficherProduits")
	public List<Product> afficherProduits(){
		return produits;
	}
	
	@WebMethod(operationName="ajouterProduits")
	public void ajouterProduits(@WebParam(name="code") int code,@WebParam(name="designation") String designation,@WebParam(name="prix") double prix){
		produits.add(new Product(code,designation,prix));
	}
	
	@WebMethod(operationName = "supprimerProduits")
    public boolean supprimerProduits(@WebParam(name="code") int code) {
        for(Product p : produits) {
        	if(p.getCode() == code) {
        		produits.remove(code);
        		return true;
        	}
        	else {
        		return false;
        	}
        }
		return false;
	}
	
	@WebMethod(operationName = "convertir")
	public double convertir(@WebParam(name="montant") double mt)
	{
		return mt*1.6;
	}
	
	public double somme(double a, double b) {
		return a+b;		
	}
}

package main;

import Entities.*;
import concrete.*;
import adapter.*;

public class Main {

	public static void main(String[] args) {
		User murat=new User();
		murat.setId(1);
		murat.setNationalId(13390071734L);
		murat.setFirstName("Murat");
		murat.setLastName("Arslan");
		murat.setBirthYear(1987);
		
		User busra=new User();
		busra.setId(2);
		busra.setNationalId(13621007755L);
		busra.setFirstName("Busra");
		busra.setLastName("Arslan");
		busra.setBirthYear(1991);
		
		Game game1=new Game(1,"Overwatch",300);
		Game game2=new Game(2,"TheWitcher3",350);
		Game game3=new Game(3,"GodOfWar",250);
		
		Campaing campaing1=new Campaing(1, "Yeni Yil Kampanyasi", 30);
		Campaing campaing2= new Campaing(2,"Bayram Kampanyasi",25);
		Campaing campaing3=new Campaing(3,"Ogrenci Kampanyasi",35);
		
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		userManager.add(murat);
		userManager.add(busra);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.add(campaing1);
		campaingManager.add(campaing2);
		campaingManager.add(campaing3);
		
		DiscountManager discountManager=new DiscountManager();
		
		
		SaleManager saleManager= new SaleManager(new DiscountManager());
		saleManager.sale(game3, busra, discountManager, campaing3);
		saleManager.sale(game1, murat, discountManager, campaing1);
		

	}

}

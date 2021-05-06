package Entities;

public class Campaing {
	private int id;
	private String campaignName;
	private int discount;
	
	public Campaing(int id, String campaingName, int discount) {
		this.id=id;
		this.campaignName=campaingName;
		this.discount=discount;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}



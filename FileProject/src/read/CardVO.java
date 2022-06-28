package read;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CardVO {
	private String appName;
	private String version;
	private String company;
	private int price;
	private String cardType;
	public CardVO(NodeList list) {
		super();
		for(int i=0;i<list.getLength();i++) {
			switch(list.item(i).getNodeName()) {
			case "app_name":
				appName = list.item(i).getTextContent();
				break;
			case "version":
				version = list.item(i).getTextContent();
				break;
			case "company":
				company = list.item(i).getTextContent();
				break;
			case "price":
				price = Integer.parseInt(list.item(i).getTextContent());
				break;
			case "card_type":
				cardType = list.item(i).getTextContent();
				break;
				
			}
		}
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CardVO [appName=" + appName + ", version=" + version + ", company=" + company + ", price=" + price
				+ ", cardType=" + cardType + "]";
	}
	
	
}

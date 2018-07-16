package jp.rolengrays.bento.entity;

/**
 * Entityがクラス名に入っているが、JPAエンティティではなく、ただのクラス
 * @author rolengrays
 *
 */
public class BentoDummyEntity {
	private int id;
	private String name;
	private int price;
	
	public BentoDummyEntity(int id, String name,int price) {
		this.setId(id);
		this.setName(name);
        this.setPrice(price);
	}
	
	public int getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}

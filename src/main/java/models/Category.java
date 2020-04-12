package models;

import com.google.gson.annotations.SerializedName;

public class Category{

	@SerializedName("id")
	private int id;

	@SerializedName("name")
	private String name;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"Category{" +
					"id = '" + id + '\'' +
					",name = '" + name + '\'' +
			"}";
		}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Category cat = (Category) obj;
		return this.id == cat.getId()
				&& ((this.name != null && this.name.equals(cat.getName())
					|| (this.name == null && cat.getName() == null)));
	}
}
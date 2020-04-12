package models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Pet{

	public Pet() {
		this.photoUrls = new ArrayList<String>();
		this.tags = new ArrayList<TagsItem>();
	}

	@SerializedName("id")
	private int id;

	@SerializedName("category")
	private Category category;

	@SerializedName("name")
	private String name;

	@SerializedName("photoUrls")
	private List<String> photoUrls;

	@SerializedName("tags")
	private List<TagsItem> tags;

	@SerializedName("status")
	private String status;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPhotoUrls(List<String> photoUrls){
		this.photoUrls = photoUrls;
	}

	public List<String> getPhotoUrls(){
		return photoUrls;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Pet{" +
					"id = '" + id + '\'' +
					",category = '" + category + '\'' +
					",name = '" + name + '\'' +
					",photoUrls = '" + photoUrls + '\'' +
					",tags = '" + tags + '\'' +
					",status = '" + status + '\'' +
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
		Pet pet = (Pet) obj;
		return this.id == pet.getId()
				&& ((this.category != null && this.category.equals(pet.getCategory()))
					|| (this.category == null && pet.getCategory() == null))
				&& ((this.name != null && this.name.equals(pet.getName()))
					|| (this.name == null && pet.getName() == null))
				&& ((this.photoUrls != null && this.photoUrls.equals(pet.getPhotoUrls()))
					|| (this.photoUrls == null && pet.getPhotoUrls() == null))
				&& ((this.tags != null && this.tags.equals(pet.getTags()))
					|| (this.tags == null && pet.getTags() == null))
				&& ((this.status != null && this.status.equals(pet.getStatus()))
					|| (this.status == null && pet.getStatus() == null));
	}
}
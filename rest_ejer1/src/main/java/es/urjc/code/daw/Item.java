package es.urjc.code.daw;

public class Item {

	private long id = -1;
	private String description;
	private String checked;

	public Item() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ", checked=" + checked + "]";
	}

}

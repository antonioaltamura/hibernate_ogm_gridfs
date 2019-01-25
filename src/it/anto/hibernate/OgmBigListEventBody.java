package it.anto.hibernate;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

import org.hibernate.ogm.datastore.mongodb.type.GridFS;

/**
 * 
 */
@Embeddable
public class OgmBigListEventBody implements Serializable{

	private long id;

	/**
	 * 
	 */
	private String name;
	

	/**
	 * 
	 */
	public OgmBigListEventBody() {
	}

	//@GridFSBucket("list_field")
    GridFS list;



	@ElementCollection
    private List<RowElement> elements = new ArrayList<RowElement>();


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the elements
	 */
	public List<RowElement> getElements() {
		return elements;
	}

	/**
	 * @param elements the elements to set
	 */
	public void setElements(List<RowElement> elements) {
		this.elements = elements;
	}

	/**
	 * @return the list
	 */
	public GridFS getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(GridFS list) {
		this.list = list;
	}
   
	

}

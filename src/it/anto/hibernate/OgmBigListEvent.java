package it.anto.hibernate;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Transient;


/** This Class persists the Event and its body in Mongodb
 * 
 */

@Entity
@DiscriminatorValue("OgmBigListEvent")
public class OgmBigListEvent extends BigEvent implements Serializable{

	/** The id. */
    private long id;
	
	
	/**
	 * 
	 */
	@Embedded
	private OgmBigListEventBody ogmEventBody;


	/**
	 * 
	 */
	public OgmBigListEvent() {
	}


	/**
	 * 
	 * @return
	 */
	public OgmBigListEventBody getDCStorageBody() {
		return this.ogmEventBody;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return this.ogmEventBody.getName();
	}


	

	public OgmBigListEventBody getOgmEventBody() {
		return this.ogmEventBody;
	}


	public void setOgmEventBody(OgmBigListEventBody b) {
		this.ogmEventBody = b;
	}

}

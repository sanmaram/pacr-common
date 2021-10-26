// Generated with g9.

package com.hcsc.pacr.common.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="PACR_addr")
public class PacrAddr implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "addrId";

    @Id
    @Column(name="addr_id", unique=true, nullable=false, precision=10)
    private int addrId;
    @Column(name="address_line_1", length=40)
    private String addressLine1;
    @Column(name="address_line_2", length=40)
    private String addressLine2;
    @Column(length=3)
    private String county;
    @Column(length=3)
    private String country;
    @Column(length=2)
    private String state;
    @Column(length=25)
    private String city;
    @Column(name="zip_code", length=9)
    private String zipCode;
    @OneToMany(mappedBy="pacrAddr")
    @JsonIgnore
    private Set<PacrProviderOthSvcLocation> pacrProviderOthSvcLocation;
    @OneToMany(mappedBy="pacrAddr")
    @JsonIgnore
    private Set<PacrProviderServiceLocation> pacrProviderServiceLocation;

    /** Default constructor. */
    public PacrAddr() {
        super();
    }

    /**
     * Access method for addrId.
     *
     * @return the current value of addrId
     */
    public int getAddrId() {
        return addrId;
    }

    /**
     * Setter method for addrId.
     *
     * @param aAddrId the new value for addrId
     */
    public void setAddrId(int aAddrId) {
        addrId = aAddrId;
    }

    /**
     * Access method for addressLine1.
     *
     * @return the current value of addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter method for addressLine1.
     *
     * @param aAddressLine1 the new value for addressLine1
     */
    public void setAddressLine1(String aAddressLine1) {
        addressLine1 = aAddressLine1;
    }

    /**
     * Access method for addressLine2.
     *
     * @return the current value of addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter method for addressLine2.
     *
     * @param aAddressLine2 the new value for addressLine2
     */
    public void setAddressLine2(String aAddressLine2) {
        addressLine2 = aAddressLine2;
    }

    /**
     * Access method for county.
     *
     * @return the current value of county
     */
    public String getCounty() {
        return county;
    }

    /**
     * Setter method for county.
     *
     * @param aCounty the new value for county
     */
    public void setCounty(String aCounty) {
        county = aCounty;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(String aCountry) {
        country = aCountry;
    }

    /**
     * Access method for state.
     *
     * @return the current value of state
     */
    public String getState() {
        return state;
    }

    /**
     * Setter method for state.
     *
     * @param aState the new value for state
     */
    public void setState(String aState) {
        state = aState;
    }

    /**
     * Access method for city.
     *
     * @return the current value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for city.
     *
     * @param aCity the new value for city
     */
    public void setCity(String aCity) {
        city = aCity;
    }

    /**
     * Access method for zipCode.
     *
     * @return the current value of zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter method for zipCode.
     *
     * @param aZipCode the new value for zipCode
     */
    public void setZipCode(String aZipCode) {
        zipCode = aZipCode;
    }

    /**
     * Access method for pacrProviderOthSvcLocation.
     *
     * @return the current value of pacrProviderOthSvcLocation
     */
    public Set<PacrProviderOthSvcLocation> getPacrProviderOthSvcLocation() {
        return pacrProviderOthSvcLocation;
    }

    /**
     * Setter method for pacrProviderOthSvcLocation.
     *
     * @param aPacrProviderOthSvcLocation the new value for pacrProviderOthSvcLocation
     */
    public void setPacrProviderOthSvcLocation(Set<PacrProviderOthSvcLocation> aPacrProviderOthSvcLocation) {
        pacrProviderOthSvcLocation = aPacrProviderOthSvcLocation;
    }

    /**
     * Access method for pacrProviderServiceLocation.
     *
     * @return the current value of pacrProviderServiceLocation
     */
    public Set<PacrProviderServiceLocation> getPacrProviderServiceLocation() {
        return pacrProviderServiceLocation;
    }

    /**
     * Setter method for pacrProviderServiceLocation.
     *
     * @param aPacrProviderServiceLocation the new value for pacrProviderServiceLocation
     */
    public void setPacrProviderServiceLocation(Set<PacrProviderServiceLocation> aPacrProviderServiceLocation) {
        pacrProviderServiceLocation = aPacrProviderServiceLocation;
    }

    /**
     * Compares the key for this instance with another PacrAddr.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PacrAddr and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PacrAddr)) {
            return false;
        }
        PacrAddr that = (PacrAddr) other;
        if (this.getAddrId() != that.getAddrId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PacrAddr.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PacrAddr)) return false;
        return this.equalKeys(other) && ((PacrAddr)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getAddrId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[PacrAddr |");
        sb.append(" addrId=").append(getAddrId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("addrId", Integer.valueOf(getAddrId()));
        return ret;
    }

}

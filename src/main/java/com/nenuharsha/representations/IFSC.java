package com.nenuharsha.representations;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreType
public class IFSC {
    @JsonIgnore
    @JsonProperty("BANK")
    private String BANK;
    @JsonIgnore
    @JsonProperty("IFSC")
    private String IFSC;
    @JsonIgnore
    @JsonProperty("BRANCH")
    private String BRANCH;
    @JsonIgnore
    @JsonProperty("ADDRESS")
    private String ADDRESS;
    @JsonIgnore
    @JsonProperty("CONTACT")
    private String CONTACT="NOT AVAILABLE";
    @JsonProperty("CITY")
    private String CITY;
    @JsonIgnore
    @JsonProperty("RTGS")
    private Boolean RTGS=new Boolean("false");
    @JsonIgnore
    @JsonProperty("DISTRICT")
    private String DISTRICT;
    @JsonIgnore
    @JsonProperty("STATE")
    private String STATE;
    @JsonIgnore
    @JsonProperty("BANKCODE")
    private String BANKCODE;

    public IFSC(){
    }

    public IFSC(@JsonProperty("BANK") String BANK,
                @JsonProperty("IFSC") String IFSC,
                @JsonProperty("BRANCH") String BRANCH,
                @JsonProperty("ADDRESS") String ADDRESS,
                @JsonProperty("CONTACT") String CONTACT,
                @JsonProperty("CITY") String CITY,
                @JsonProperty("RTGS") Boolean RTGS,
                @JsonProperty("DISTRICT") String DISTRICT,
                @JsonProperty("STATE") String STATE,
                @JsonProperty("BANKCODE") String BANKCODE) {
        this.BANK = BANK;
        this.IFSC = IFSC;
        this.BRANCH = BRANCH;
        this.ADDRESS = ADDRESS;
        this.CONTACT = (CONTACT==null)?"NOT AVAILABLE":CONTACT;
        this.CITY = CITY;
        this.RTGS = (RTGS==null)?false:RTGS;
        this.DISTRICT = DISTRICT;
        this.STATE = STATE;
        this.BANKCODE = BANKCODE;
    }

    @JsonProperty("BANK")
    public String getBANK() {
        return BANK;
    }

    @JsonProperty("IFSC")
    public String getIFSC() {
        return IFSC;
    }

    @JsonProperty("BRANCH")
    public String getBRANCH() {
        return BRANCH;
    }

    @JsonProperty("ADDRESS")
    public String getADDRESS() {
        return ADDRESS;
    }

    @JsonProperty("CONTACT")
    public String getCONTACT() {
        return CONTACT;
    }

    @JsonProperty("CITY")
    public String getCITY() {
        return CITY;
    }

    @JsonProperty("RTGS")
    public Boolean getRTGS() {
        return RTGS;
    }


    @JsonProperty("DISTRICT")
    public String getDISTRICT() {
        return DISTRICT;
    }

    @JsonProperty("STATE")
    public String getSTATE() {
        return STATE;
    }

    @JsonProperty("BANKCODE")
    public String getBANKCODE() {
        return BANKCODE;
    }

    @Override
    public String toString() {
        return "IFSC{" +
                "BANK='" + BANK + '\'' +
                ", IFSC='" + IFSC + '\'' +
                ", BRANCH='" + BRANCH + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", CONTACT='" + CONTACT + '\'' +
                ", CITY='" + CITY + '\'' +
                ", RTGS=" + RTGS +
                ", DISTRICT='" + DISTRICT + '\'' +
                ", STATE='" + STATE + '\'' +
                ", BANKCODE='" + BANKCODE + '\'' +
                '}';
    }
}

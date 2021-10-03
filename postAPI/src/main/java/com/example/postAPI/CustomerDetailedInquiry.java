package com.example.postAPI;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CustomerDetailedInquiry")
public class CustomerDetailedInquiry {
    public CustomerDetailedInquiry() {}

    private int dial;
    private String fromdate;
    private String todate;
    private String Lang;
    private String TransactionID;
    private String callername;

    public CustomerDetailedInquiry(
         int dial, String fromdate,
         String todate, String Lang,
         String callername, String TransactionID
    ){
        super();
        this.dial = dial;
        this.fromdate = fromdate;
        this.todate = todate;
        this.Lang = Lang;
        this.TransactionID = TransactionID;
        this.callername = callername;

    }
    @XmlElement
    public int getdial(){
        return dial;
    }
    public void setDial(int dial) {
        this.dial = dial;
    }

    @XmlElement
    public String getFromdate(){
        return fromdate;
    }
    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }
    @XmlElement
    public String getTodate(){
        return todate;
    }
    public void setTodate(String todate) {
        this.todate = todate;
    }

    @XmlElement
    public String getLang(){
        return getLang();
    }
    public void setLang(String lang) {
        this.Lang= lang;
    }
    @XmlElement
    public String getTransactionID(){
        return TransactionID;
    }
    public void setTransactionID(String TransactionID ) {
        this.TransactionID = TransactionID;
    }

    @XmlElement
    public String getCallername(){
        return callername;
    }
    public void setCallername(String callername) {
        this.callername = callername;
    }

}

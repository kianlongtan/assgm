/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyinventorymangementsystem;

/**
 *
 * @author Tan
 */
public class Medicine {
    private String MCN;

    private String MN;

    private String MQ;

    private String MSP;
    
    private String MTP;



    public Medicine() {

    }



    public Medicine(String MCN, String MN, String MQ, String MSP, String MTP) {
 
        this.MCN = MCN;

        this.MN = MN;

        this.MQ = MQ;

        this.MSP = MSP;
        
        this.MTP = MTP;

    }



    Medicine(String data) {

        String[] dataArr = data.split(",");

        this.MCN = dataArr[0];

        this.MN = dataArr[1];

        this.MQ = dataArr[2];

        this.MSP = dataArr[3];
        
        this.MTP = dataArr[4];

    }


    
    public String getMCN() {

        return MCN;

    }

    public void setMCN() {

        this.MCN = MCN;

    }



    public String getMN() {

        return MN;

    }

    public void setMN() {

        this.MN = MN;

    }



    public String getMQ() {

        return MQ;

    }

    public void setMQ() {

        this.MQ = MQ;

    }



    public String getMSP() {

        return MSP;

    }

    public void setMSP() {

        this.MSP = MSP;

    }



    public String getMTP() {

        return MTP;

    }

    public void setMTP() {

        this.MTP = MTP;

    }



    @Override

    public String toString() {

        return (this.MCN + "," + this.MN + "," + this.MQ + "," + this.MSP + "," + this.MTP).toLowerCase();

    }



}

